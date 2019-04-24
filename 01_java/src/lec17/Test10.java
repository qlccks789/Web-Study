/**
 * 	OutputStream : 바이트 출력
 * 
 *  Writer : 문자 출력
 *   
 *  OutputStream
 *  write(int) : byte 처리
 *  write(byte[]) : 바이트 배열의 내용을 출력
 *  write(byte[], int, int) : 바이트 배열의 일부의 내용을 출력
 *  
 *  writer
 *  write(int) : char 처리
 *  write(char[]) : char 배열의 내용을 처리
 *  write(char[], int, int) : char 배열의 일부의 내용을 처리
 *  
 *  flush() : 버퍼의 내용을 출력
 *  close() : 스트림(입출력에서데이터가흘러가는통로) 닫기
 */
package lec17;

import java.io.FileWriter;

public class Test10 {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("data/lec17/test10.txt");
			FileWriter fos = new FileWriter("data/lec17/test10.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write('d');
			fos.write('가');
			
//			fos.flush();  // 버퍼에 있는 내용을 출력 
			
			fos.close();  // 자동 flush() 메서드를 호출한다., 다 썼으니 닫아... 
			System.out.println("파일 쓰기 성공~!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
