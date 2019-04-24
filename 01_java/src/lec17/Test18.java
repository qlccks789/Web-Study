package lec17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Test18 {
	public static void main(String[] args) {
		String[] msg = {"잘살아~", "행복해~", "부자되세요", "건강해라", "잘자라~"};
		String[] user = {"공유", "현빈", "송강호", "김혜수", "전지현"};
		
		Random r = new Random();
		
		try {
			FileWriter fw = new FileWriter("data/lec17/msg.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);  // System.out.print 와 같은 것
			for (int i = 1; i <= 100; i++) {
				pw.printf("%d. %s님 %s\n", i, user[r.nextInt(user.length)], msg[r.nextInt(msg.length)] );
//				bw.write(i + ". " + user[r.nextInt(user.length)] + "님" + msg[r.nextInt(msg.length)]);
				bw.newLine();
			}
			pw.close();
			bw.close();
			fw.close();
			System.out.println("성공...");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}
}
