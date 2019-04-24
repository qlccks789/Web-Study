/**
  * Scanner 사용 불가 * 

   
   화면에서 문자를 입력받아 입력받은 문자를 출력 
   단, 문자는 한문자만 입력 받는다.
   입력받은 문자가 'Q' 또는 'q' 일경우 
   화면에 "종료합니다" 메시지 출력 
   
   실행결과 >
   한문자를 입력하세요 : m
   입력된 문자는 m 입니다.
   한문자를 입력하세요 : q
   종료합니다. 
 */
package lec17.quiz;

import java.io.InputStream;

public class Quiz01 {
	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			while (true) {
				System.out.print("한문자를 입력하세요 : ");
				char inputData = (char) is.read();
				is.read(); 
				is.read(); 
				
				/*
				is.skip(is.available());
				 */
				
				if (Character.toUpperCase(inputData) == 'Q') {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println("입력된 데이터 : " + inputData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
