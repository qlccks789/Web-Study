/*
find.txt 파일내용을 읽어서 아래와 같이 출력하는 프로그램을 작성하시오

find.txt 파일 내용
-------------------------
public class FileFind {
    public static void main(String[] args) {
        System.out.println("hello");
        int i = 100;
        System.out.println(i);
    }
}

출력결과 > 
// 3번째 줄과 5번째 줄의 라인을 출력..

3:        System.out.println("hello");
5:        System.out.println(i);

-------------------------

 */
package lec17.homework;

import java.io.FileReader;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        try {
            searchFileContent("data/lec17/exam/find.txt", "System");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
     * 
     * @param readFileName : 읽을 파일명
     * @param findStr      : 파일에서 찾을 내용
     * @throws Exception
     */
    public static void searchFileContent(String readFileName, String findStr) throws Exception {
            
            // 아래 부분에 내용을 구현합니다. 클래스의 다른 부분은 변경하지 않습니다.

            ////////////////////////////////////////////////////
    	FileReader fr = new FileReader(readFileName);
    	Scanner sc = new Scanner(fr);
    	int cnt = 0;
    	
    	while (sc.hasNextLine()) {
    		findStr = sc.nextLine();
    		cnt++;
    		if (findStr.contains("System")) {
    			System.out.println(cnt +":\t"+findStr);
    		}
    	}
    	
    	
    	
    }
}