/*
 *   1. 아래의 내용으로 데이터 파일을 작성합니다.
 *      파일형식 - 이름:자바:SQL:Jdbc
 *   
 *   data02.txt
 *   ------------------------------
 *   김기수:98:66:78
 *   이지수:88:56:88
 *   박수리:78:86:58
 *   ------------------------------
 * 
 *   파일의 내용을 읽어서 아래와 같은 형식으로 출력하는 프로그램을 작성하시오
 *   
 *   수료 기준 
 *   - 자바 : 70점 이상
 *   - SQL  : 80점 이상
 *   - Jdbc : 80점 이상
 *   
 *   실행시의 결과 출력 형식
 *   
 *   ----------------------------------------
 *   학생정보
 *   ----------------------------------------
 *   김기수 : 총점(242점), 자바(98점-수료), SQL(66점-미수료), Jdbc(78점-미수료)
 *   박수리 : 총점(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)
 *   이기수 : 총점(232점), 자바(88점-수료), SQL(56점-미수료), Jdbc(88점-수료)
 *   ----------------------------------------
 */
package lec15.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(String javaScore) {
		this.javaScore = javaScore;
	}
	public String getSqlScore() {
		return sqlScore;
	}
	public void setSqlScore(String sqlScore) {
		this.sqlScore = sqlScore;
	}
	public String getJdbcScore() {
		return jdbcScore;
	}
	public void setJdbcScore(String jdbcScore) {
		this.jdbcScore = jdbcScore;
	}
	private String javaScore;
	private String sqlScore;
	private String jdbcScore;
	private int sum;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int compareTo(Student s) {
		
		return this.getName().compareTo(s.getName());
	}


}

public class Exam02 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("src/lec15/homework/data02.txt");
		Scanner sc = new Scanner(f);
		List<Student> list = new ArrayList<>();
		
		String [] str = null;
		while(sc.hasNextLine()) {
			 str = sc.nextLine().split(":");			
			 Student s = new Student();
			 s.setName(str[0]);
			 int sum = Integer.parseInt(str[1]) +Integer.parseInt(str[2]) +Integer.parseInt(str[3]); 
			 
			 if(Integer.parseInt(str[1]) >= 70) {
				 str[1] += "점-수료";
			 }else {
				 str[1] += "점-미수료";
			 }
			 if(Integer.parseInt(str[2]) >= 80) {
				 str[2] += "점-수료";
			 }else {
				 str[2] += "점-미수료";
			 }
			 if(Integer.parseInt(str[3]) >= 80) {
				 str[3] += "점-수료";
			 }else {
				 str[3] += "점-미수료";
			 }
			 
			 s.setJavaScore(str[1]);
			 s.setSqlScore(str[2]);
			 s.setJdbcScore(str[3]);
			 s.setSum(sum);
			 list.add(s);
		}
		Collections.sort(list);
		System.out.println("수료 기준"); 
		System.out.println("- 자바 : 70점 이상"); 
		System.out.println("- SQL  : 80점 이상"); 
		System.out.println("- Jdbc : 80점 이상"); 
		
		System.out.println("----------------------------------------");
		System.out.println("학생정보");
		System.out.println("----------------------------------------");
		// *   박수리 : 총점(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)

		for(Student std : list) {
			System.out.printf("%s : 총점(%d), 자바(%s), SQL(%s), Jdbc(%s)%n",
					std.getName(), 
					std.getSum(), 
					std.getJavaScore(), 
					std.getSqlScore(), 
					std.getJdbcScore()
					);
		}
		System.out.println("----------------------------------------");
	}
}