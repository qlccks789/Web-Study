/**
 *  썸네일 생성하기
 *  
 *  thumbnailator 라이브러리 사용
 */
package kr.co.mlec.jsp04.fileupload;

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
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.coobird.thumbnailator.Thumbnails;

@WebServlet("/jsp04/fileupload/test04.do")
public class Test04 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 모듈별 디렉토리 생성 저장하기
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
		
		File f = mRequest.getFile("attach");
		if (f != null) {
			System.out.println("파일크기(byte) : " + f.length());
			System.out.println(
					"사용자가 올린 파일명 : " + 
			        mRequest.getOriginalFileName("attach")
			);
			String systemName = mRequest.getFilesystemName(
					"attach"
			);
			System.out.println(
					"서버에 실제 저장된 파일명 : " + systemName
			);
			
			// 썸네일 생성하기
			Thumbnails.of(
					new File(f.getParent(), systemName)
			)
			.size(200, 120)
			.outputFormat("jpg")
			.toFile(
					new File(f.getParent(), "thumb_" + systemName)
			);
		} 
	}
}









