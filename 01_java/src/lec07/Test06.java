package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) throws FileNotFoundException {
		ActorController ctrl = new ActorController();		
		ctrl.service();
		
		// "이" 로 시작하는 이름을 가진 배우를 출력..
		ctrl.showActorByName("이");
		
		// 35보다 나이가 적은 배우들의 정보 출력
		// 1~34 까지..출력..
		ctrl.showActorByAge(35);
	}
}
