package net08.webserver;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws Exception {
		String msg = "자바";
		String enMsg = URLEncoder.encode(msg, "utf-8");
		System.out.println(enMsg);
		
		String deMsg = URLDecoder.decode(enMsg, "utf-8");
		System.out.println(deMsg);
		
		String startline = "GET /board/delete?no=100&comment_no=1 HTTP/1.1";
		
		/*
		 *   요청메서드 : GET
		 *   요청페이지 : /board/delete
		 *   요청 파라미터
		 *   no : 100
		 *   comment_no : 1
		 */
		String[] arr = startline.split(" ");
		System.out.println(Arrays.toString(arr));
		String method = arr[0];
		String url = arr[1];
		
		// /board/delete
		String[] urlArr = url.split("\\?");
		String path = urlArr[0];
		System.out.println("path : " + path);
		
		if (urlArr.length == 2) {
			String query = urlArr[1];
			System.out.println("query : " + query);
			
			String[] paramArr = query.split("&");
			System.out.println(Arrays.toString(paramArr));
			
			for (String param : paramArr) {
				String[] paramInfo = param.split("=");
				System.out.println(paramInfo[0] + " : " + paramInfo[1]);
			}
		}
	}
}



















