package kr.co.mlec.board.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.board.vo.FileVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.file.FunnyFileRenamePolicy;

@WebServlet("/board/write.do")
public class WriteBoardController extends HttpServlet {
	
	private BoardMapper mapper;
	
	public WriteBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uploadRoot = "c:/bit2019/upload";
		SimpleDateFormat sdf = new SimpleDateFormat(
				"/yyyy/MM/dd"
		);
		String path = "/board" + sdf.format(new Date());
		File file = new File(uploadRoot + path);
		if (file.exists() == false) file.mkdirs();
		
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				uploadRoot + path, //  
				1024 * 1024 * 100,  // 
				"utf-8", // 
				new FunnyFileRenamePolicy()
		);
		
		// 파라미터 정보를 읽어 데이터베이스에 저장하기
		BoardVO board = new BoardVO();
		board.setTitle(mRequest.getParameter("title"));
		board.setWriter(mRequest.getParameter("writer"));
		board.setContent(mRequest.getParameter("content"));
		mapper.insertBoard(board);

		// 첨부파일 부분 추가
		String name = "attach";
		File f = mRequest.getFile(name);
		if (f != null) {
			String orgName = mRequest.getOriginalFileName(name);
			String systemName = mRequest.getFilesystemName(name);
			long fileSize = f.length();
			
			// 데이터베이스에 파일 정보 저장
			FileVO fileVO = new FileVO();
			fileVO.setNo(board.getNo());
			fileVO.setFilePath(path);
			fileVO.setOrgName(orgName);
			fileVO.setSystemName(systemName);
			fileVO.setFileSize((int)fileSize);
			mapper.insertFile(fileVO);
		}
		
		response.sendRedirect("list.do");
	}
}


