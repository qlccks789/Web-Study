package lec17.homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test05 {
    public static void main(String[] args) {
        try {
            searchEmployeeInfo("data/lec17/exam/employee.txt", "김");
            searchEmployeeInfo("data/lec17/exam/employee.txt", "다");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param readFileName : 읽을 파일명
     * @param lastName     : 찾을 성씨
     * @throws Exception
     */
    public static void searchEmployeeInfo(String readFileName, String lastName) 
            throws Exception {

        // 내용 구현
    	FileReader fr = new FileReader(readFileName);
    	BufferedReader br = new BufferedReader(fr);
    	
    	System.out.println("============================");
    	int cnt = 0;
    	while (true) {
    		String s = br.readLine();
    		if (s == null) break;
    		if (s.startsWith(lastName)) {
    			String[] arr = s.split(":");
    			System.out.printf("이름 : %s\t", arr[0]);
    			System.out.printf("나이 : %s\t", arr[1]);
    			System.out.printf("부서 : %s\t", arr[2]);
    			System.out.printf("월급 : %s\n", arr[3]);
    			cnt++;
    		}
    	}
    	System.out.println("============================");
    	System.out.printf("%s씨 성을 가진 회원은 총 %d명 입니다.%n", lastName, cnt);
    }
}