// 2차원 배열 사용하기 - 1번 과정
package lec04.quiz;

public class Quiz08 {
	public static void main(String[] args) {
		// 고슬링
		// 파이썬, 자바, SQL 의 점수 관리..
		// 1학기 성적
		String[] subject = {"파이썬", "자바", "SQL"};
		int[] score = {95, 88, 44};
		System.out.println("고슬링 학생의 성적");
		System.out.println("1학기 성적");
		// 파이썬(95) 자바(88) SQL(44)
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s(%d) ", subject[i], score[i]);
		}
	}
}








