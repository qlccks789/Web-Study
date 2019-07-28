package server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class HttpServletRequest {
	private InputStream in;
	
	private String method;  // GET or POST
	private String requestURI;  // 요청 Path(파라미터 제외된)
	private String queryString;  // uri에서 ? 다음의 모든 파라미터 문자열
	// 파라미터 정보를 담는 맵 객체
	private Map<String, String> paramMap = new HashMap<>();
	
	public HttpServletRequest(InputStream in) throws Exception {
		this.in = in;
		init();
	}
	private void init() throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(in, "utf-8")	
		);
		
		String startline = br.readLine();
		if (startline == null) return;
		
		String[] arr = startline.split(" ");
		method = arr[0];
		
		String[] uri = arr[1].split("\\?");
		requestURI = uri[0];
		
		// GET 방식일 경우 파라미터 처리
		if (uri.length == 2) {
			queryString = uri[1];
			setParamMap();
		}
		
		// POST 방식...
		// 헤더 정보 읽기
		while (true) {
			String line = br.readLine();
			if (line.equals("")) break;
		}
		
		// POST 방식일 경우 BODY에 있는 파라미터 읽기
		if ("POST".equals(method)) {
			// body 에 존재하는 파라미터 정보를 읽어서 담을 변수 선언
			String bodyParam = "";
			while (br.ready()) {
				int ch = br.read();
				bodyParam += (char)ch;
			}
			
			// POST 방식이면서 파라미터가 있다면 파라미터 설정 작업 진행
			if (bodyParam.length() > 0) {
				// bodyParam -> no=1&commentNo=10
				queryString = bodyParam;
				setParamMap();
			}
		}
		
	}
	
	// 파라미터 정보를 파싱해서 맵에 설정하는 기능
	private void setParamMap() throws Exception {
		// 예> no=1&commentNo=10&msg=aaa
		String[] params = queryString.split("&");
		for (String param : params) {
			String[] data = param.split("=");
			if (data.length == 2) {
				paramMap.put(
						data[0], 
						URLDecoder.decode(data[1], "utf-8") 
				);
			} else {
				paramMap.put(data[0], ""); 
			}
		}
	}
	
	public String getMethod() {
		return method;
	}
	public String getRequestURI() {
		return requestURI;
	}
	public String getQueryString() {
		return queryString;
	}
	public Map<String, String> getParamMap() {
		return paramMap;
	}
	
	public String getParameter(String key) {
		return paramMap.get(key);
	}
	
}















