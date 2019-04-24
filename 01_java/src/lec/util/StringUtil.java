package lec.util;

import java.util.Arrays;

public class StringUtil {
	
	public boolean equals(String data1, String data2) {
		int len = data1.length();
		if (len != data2.length()) return false;
		
		for (int i = 0; i < len; i++) {
			if (data1.charAt(i) != data2.charAt(i)) return false;
		}
		
		return true;
	}
	
	public boolean endsWith(String data, String find) {
		int dataLen = data.length();
		int findLen = find.length();
		if (dataLen < findLen) return false;
		for (int i = findLen - 1, k = dataLen - 1; i >= 0; i--, k--) {
			if (data.charAt(k) != find.charAt(i)) return false;
		}
		return true;
	}
	
	public boolean startsWith(String data, String find) {
		int len = find.length();
		if (data.length() < len) return false;
		
		for (int i = 0; i < len; i++) {
			if (data.charAt(i) != find.charAt(i)) return false;
		}
		return true;
	}
	
	/**
	 * data를 받아서 내용을 거꾸로 변경한 결과를 반환한다.
	 * @param data
	 * @return
	 */
	public String reverse(String data) {
		String result = "";
		for (int index = data.length() - 1; index >= 0; index--) {
			result += data.charAt(index);
		}
		return result;
	}

	// a -> "홍길동:22:서울특별시 마포구:hong@a.com" 
	// b -> ":"
	public String[] split(String a, String b) {
		int pos = 0;
		String[] temp = new String[a.length()];
		while (true) {
			// int index = "홍길동:22:서울특별시 마포구:hong@a.com".indexOf(":");
			// index = 3
			// int index = "22:서울특별시 마포구:hong@a.com".indexOf(":");
			// index = 2
			// int index = "서울특별시 마포구:hong@a.com".indexOf(":");
			// index = 9
			// int index = "hong@a.com".indexOf(":");
			// index = -1
			int index = a.indexOf(b);
			if (index == -1) {
				// hong@a.com
				temp[pos++] = a;
				break;
			}
			// 홍길동
			// 22
			// 서울특별시 마포구
			temp[pos++] = a.substring(0, index);
			
			// 22:서울특별시 마포구:hong@a.com
			// 서울특별시 마포구:hong@a.com
			// hong@a.com
			a = a.substring(index + 1);
		}

		// 배열의 일부요소를 새로운 배열로 복사한 다음 반환한다.
		
		/*
		String[] result = new String[pos];
		System.arraycopy(temp, 0, result, 0, pos);
		 */
		
		/*
		String[] result = Arrays.copyOfRange(temp, 0, pos);
		return result;
		*/
		
		return Arrays.copyOfRange(temp, 0, pos);
	}
}









