/**
 * 	InputStream 이해하기


 *  Reader
 *  
 *  API 메서드의 데이터타입 부분만 다르다고 생각한다.
 *  
 *  int read() : byte 단위 처리..
 *  int read(byte[]) : 읽어서 바이트 배열에 저장 (최대 byte[] 크기만큼 읽을수있다.), 실제 배열에 읽은 개수 반환
 *  int read(byte[], int(시작점), int(크기)) 
 *  
 *  int read() : char 단위 처리
 *  int read(char[])
 *  int read(char[], int(시작점), int(크기)) 
 * 
 */
package lec17;

import java.io.InputStream;

public class Test07 {
	public static void main(String[] args) {
		// 1.5 부터 지원
//		Scanner sc = new Scanner(System.in);
		
		InputStream in = System.in;
		
		System.out.println((int)'\r');
		System.out.println((int)'\n');
		
		try {
			while(true) {
				int ch = in.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
			int ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
		 */
		
		
		
		
	}	
}
