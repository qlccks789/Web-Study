package kr.co.mlec.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardMapper;
import kr.co.mlec.repository.vo.BoardVO;
import kr.co.mlec.repository.vo.PageVO;

@WebServlet("/basic/test05.do")
public class Test05 extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
		
		BoardMapper mapper = 
				MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
		
		List<BoardVO> list = mapper.selectBoard(new PageVO());
		System.out.println(list.size());
		
		PrintWriter out = response.getWriter();
		out.println(new Gson().toJson(list));
		out.close();
	}

}





















