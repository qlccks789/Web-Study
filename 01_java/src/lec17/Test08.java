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
import java.io.InputStreamReader;

public class Test08 {
	public static void main(String[] args) {
		// Scanner 쓰지 않고 사용자에게 입력 받기.
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		
		System.out.println((int)'\r');
		System.out.println((int)'\n');
		
		try {
			while(true) {
				int ch = isr.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}	
}
