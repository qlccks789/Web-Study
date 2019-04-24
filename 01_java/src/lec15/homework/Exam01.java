
package lec15.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Player1 implements Comparable<Player1>{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int compareTo(Player1 player1) {
		
		return player1.score-this.score;
	}
}


public class Exam01 {
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/lec15/homework/data01.txt");
		Scanner sc = new Scanner(f);
		
		List <Player1> list = new ArrayList<>();
		
		
		String [] str = null; // file안의 string을 받아준다
		while(sc.hasNextLine()) {			
			Player1 p = new Player1();
			str = sc.nextLine().split(":");
			p.setName(str[0]);
			p.setScore(Integer.parseInt(str[1]));
			list.add(p);
			
		}
		
		Player1 [] p1 = new Player1[0];
		
		Collections.sort(list);

		System.out.println("선수 성적순");
		System.out.println("선수명\t점수");
		
		for(Player1 p: list) {
			System.out.printf("%s 선수 %s점%n",p.getName(), p.getScore());
		}

	}
}