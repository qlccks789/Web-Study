// 2차원 배열 사용하기 - 1번 과정
package lec04.quiz;

public class Quiz09 {
	public static void main(String[] args) {
		// 고슬링
		// 파이썬, 자바, SQL 의 점수 관리..
		// 1학기 성적
		// 2학기 성적
		String[] subject = {"파이썬", "자바", "SQL"};
		// {{}, {}}
		int[][] score = {
				{95, 88, 44}, 
				{91, 77, 66}
		};
		System.out.println("고슬링 학생의 성적");
		
		for (int k = 0; k < score.length; k++) {
			System.out.println(k + 1 + "학기 성적");
			// 파이썬(95) 자바(88) SQL(44)
			for (int i = 0; i < score[k].length; i++) {
				System.out.printf("%s(%d) ", subject[i], score[k][i]);
			}
			System.out.println();
			System.out.println("-------------------");
		}
		
	}
}








