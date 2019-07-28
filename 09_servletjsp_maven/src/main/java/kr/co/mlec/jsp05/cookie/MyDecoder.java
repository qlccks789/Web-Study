package kr.co.mlec.jsp05.cookie;

import java.net.URLDecoder;

public class MyDecoder {
	public static String decode(String data) throws Exception {
		return URLDecoder.decode(data, "utf-8");
	}
}
