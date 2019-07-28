/**
 * 파라미터 모든 정보를 사용해야 할때
 * Map<String, String[]> reqeust.getParameterMap() 사용하기
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test10.do")
public class Test10 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> keys = paramMap.keySet();
		for (String key : keys) {
			System.out.println("name : " + key);
			String[] values = paramMap.get(key);
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


























