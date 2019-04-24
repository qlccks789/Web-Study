/**
 * 	java.io 



 * 	입출력 이해하기
 * 	
 * 	입력 : 프로그램으로 데이터가 들어오는 것
 * 	출력 : 프로그램에서 내보내는 것
 * 	
 * 	화면에 이름을 출력하는 프로그램 : 출력
 * 	화면에서 사용자에게 나이를 받아서 화면에 출력 : 입출력
 * 
 * 	c드라이브에 있는 a.txt 파일의 내용을 ArrayList에 담아라..   : 입력
 * 
 * 	a.txt 파일의 내용을 acopy.txt 파일에 복사해라..   : 입출력
 * 	
 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 	추상개념의 클래스 : 아래의 클래스를 상속받아서 구현해야 한다..
 *  
 *  처리되는 단위로 구분..(byte, char) : 직접 해석이 가능하면 문자단위 가능
 *  
 *  byte 단위 처리 
 * 	InputStream(입력)
 * 	OutputStream(출력)
 * 
 *  char(문자) 단위 처리
 * 	Reader(입력)
 * 	Writer(출력)
 *  
 *  FileInputStream : byte 입력  -> File의 내용을 바이트 단위로 입력받을 때..
 *  FileOutputStream : byte 출력 -> File의 내용을 바이트 단위로 출력하려 할 때..
 *  FileReader : 파일의 내용을 문자단위로 입력받을 때
 *  FileWriter : 파일의 내용을 문자단위로 출력하려 할 때..
 *  
 *  BufferedInputStream : 바이트 단위로 입력할 때 속도를 향상시킨다.
 *  BufferedOutputStream : 바이트 단위로 출력할 때 속도를 향상시킨다.
 *  BufferedReader : 문자 단위로 입력할 때 속도를 향상시킨다.
 *  BufferedWriter : 문자 단위로 출력할 때 속도를 향상시킨다.
 *  
 *  ObjectInputStream  : 객체 정보를 읽을 때 사용
 *  ObjectOutputStream : 메모리에 생성된 객체 정보를 출력 
 *  
 *  InputStreamReader : 바이트단위 처리로 온 것을 문자단위로 입력받을 때..
 *  OutputStreamWriter : 바이트단위 처리로 온 것을 문자단위로 출력받을 때..
 *  
 *  프로그램에서 Person p = new Person() 객체를 생성 했습니다.
 *  이렇게 생성된 p 객체의 내용을 result.dat 파일에 저장하고 싶습니다.
 *  
 *  필요한 클래스는???
 *  -> FileOutputStream, ObjectOutputStream
 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 	
 * 	
 * 	
 */
package lec17;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		// 파일, 디렉토리
		File f = new File("data/lec17/bbb");
		boolean exists = f.exists();	// 파일이 존재하는지 확인
		if (exists) {
			System.out.println("파일 존재함");
		} else {
			System.out.println("파일이 존재하지 않는다.");
			if (f.mkdirs()) {		// 디렉토리 생성하는 것
				System.out.println("디렉토리 생성 성공함");
			} else {
				System.out.println("생성 실패함");
			}
		}
		
		
		
		
		
	}
}
