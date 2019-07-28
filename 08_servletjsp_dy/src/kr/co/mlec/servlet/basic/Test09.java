/**
 * 파라미터 모든 정보를 사용해야 할때
 * Enumeration<String> request.getParameterNames()
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test09.do")
public class Test09 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println("name : " + name);
			
			String[] values = request.getParameterValues(name);
			
			if (values.length == 1) {
				System.out.println("value : " + values[0]);
				continue;
			}
			
			for (String value : values) {
				System.out.println("value : " + value);
			}
		}
	}

}









