// 2차원 배열 사용하기 - 1번 과정
package lec04.quiz;

public class Quiz10 {
	public static void main(String[] args) {
		// 고슬링
		// 파이썬, 자바, SQL 의 점수 관리..
		// 학년별
		// 1학기 성적
		// 2학기 성적
		String[] subject = {"파이썬", "자바", "SQL"};
		// {{}, {}}
		int[][][] score = {
				{	
					{90, 88, 44}, 
					{100, 77, 66}
				},
				{	
					{95, 88, 44}, 
					{91, 77, 66}
				}
		};
		System.out.println("고슬링 학생의 성적");
		// 학년에 대한 반복
		for (int j = 0; j < score.length; j++) {
			System.out.printf("%d 학년 성적%n", j + 1);
			System.out.println("******************");
			// 학기에 대한 반복
			for (int k = 0; k < score[j].length; k++) {
				System.out.println(k + 1 + "학기 성적");
				// 파이썬(95) 자바(88) SQL(44)
				for (int i = 0; i < score[j][k].length; i++) {
					System.out.printf("%s(%d) ", subject[i], score[j][k][i]);
				}
				System.out.println();
			}
			System.out.println("-------------------");
		}
	}
}








