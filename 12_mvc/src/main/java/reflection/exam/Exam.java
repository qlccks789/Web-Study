package reflection.exam;

import java.io.FileInputStream;
import java.util.Properties;

public class Exam {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(
					new FileInputStream(
							"src/main/java/reflection/exam/exam.properties"
					)
			);
			/*
			Board board = (Board)WebUtil.getParamToVO(Board.class, prop);
			System.out.println("번호 : " + board.getNo());
			System.out.println("제목 : " + board.getTitle());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("내용 : " + board.getContent());
			*/
			Member member = (Member)WebUtil.getParamToVO(Member.class, prop);
			System.out.println("아이디 : " + member.getId());
			System.out.println("이름 : " + member.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	
	
	
	
	
	
}
