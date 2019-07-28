/*
 * 	  호출할 URI 입력 : /board/list.do
 *   list 메서드 호출
 * 	  호출할 URI 입력 : /member/regist.do
 *   regist 호출
 * 	  호출할 URI 입력 : quit
 *   프로그램이 종료되었습니다.
 */
package reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class Test04 {
	
	/*
	public static void main(String[] args) {
		try {
			// src/java/main/reflection/test04.properties
			Properties prop = new Properties();
			// 지정된 스트림으로부터 데이터를 로드한다.
			prop.load(
				new FileInputStream(
					"src/main/java/reflection/test04.properties"
				)
			);
			String value = prop.getProperty("/member/regist.do");
			System.out.println(value);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(
				new FileInputStream(
					"src/main/java/reflection/test04.properties"
				)
			);
			
			Scanner sc = new Scanner(System.in);
			while (true) {

				System.out.print("호출할 URI 입력 : ");
				String url = sc.nextLine();
				
				if (url.equals("quit")) break;
				
				String[] info = prop.getProperty(url).split(":");

				Class<?> clz = Class.forName(info[0]);
				Object obj = clz.newInstance();
				Method m = clz.getDeclaredMethod(info[1]);
				m.invoke(obj);
			}
			System.out.println("프로그램이 종료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
