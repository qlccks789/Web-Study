package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import lec.util.PrintUtil;

public class ActorController {
	
	// 배우들에 대한 정보를 관리하기 위한 배열 생성
	Actor[] list = new Actor[2];
	// 위치와 크기 관리하는 변수 선언.
	int pos = 0;
	
	
	
	// 성에 해당하는 배우들의 정보 출력
	// ..showActorByName("김")
	// ..showActorByName("이")
	public void showActorByName(String name) {
		PrintUtil pu = new PrintUtil();
		System.out.println(name + "으로 이름이 시작하는 배우");
		pu.print(25, "*");
		boolean flag = false;
		for (int i = 0 ; i < pos; i++) {
			Actor actor = list[i];
			// 배우의 이름이 매개변수에 넘어온 name으로 시작하는지 체크하기..
			if (actor.getName().startsWith(name)) {
				System.out.printf("이름 : %s, 나이 : %d%n", actor.getName(), actor.getAge());
				flag = true;
			}
		
		}
		if (flag == false) {
			System.out.println("배우가 존재하지 않습니다.");
		}
		pu.print(25, "*");
	}
	
	
	// 연령대에 해당하는 배우들의 정보 출력
	public void showActorByAge(int age) {
		PrintUtil pu = new PrintUtil();
		System.out.println(age + "보다 나이가 적은 배우");
		pu.print(25, "-");
		boolean flag = false;
		for (int i = 0; i < pos; i++) {
			Actor actor = list[i];
			if (actor.getAge() < age) {
				System.out.printf("이름 : %s, 나이 : %d%n", actor.getName(), actor.getAge());
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("배우가 존재하지 않습니다.");
		}
		pu.print(25, "-");
	}
	
	
	
	public void service() throws FileNotFoundException {
		// Scanner를 이용한 파일 읽기
		// File(읽을 파일이 있는 경로)
		// 이클립스에서 실행시 경로를 찾는 위치 : 프로젝트 밑에서 찾는다.
		File f = new File("data/lec07/test06.txt");
		// 예외처리 필요함 : 아직 안배움...
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {

			String line = sc.nextLine();
			// 이름 : 배수지, 나이 : 29
			String[] info = line.split(":");
			
			// actor 객체에 파일에서 읽어온 정보 설정
			Actor actor = new Actor();
			actor.setName(info[0]);
			actor.setAge(Integer.parseInt(info[1]));
			
			// 배열의 크기만큼 배우들의 정보가 담겨있다면 배열의 크기를 확장하자..
			if (list.length == pos) {
//				Actor[] temp = new Actor[pos * 2];
//				System.arraycopy(list, 0, temp, 0, pos);
//				list = temp;
				list = Arrays.copyOf(list, pos * 2);  // -> 배열늘리기랑 같은 코드 (통으로 복사 할 때 편하다)
			}
			
			// 리스트에 추가하기...
			list[pos++] = actor;
			

		}
	}
}
