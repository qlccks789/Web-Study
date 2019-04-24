/*
1. 다음의 내용으로 데이터파일을 작성하시오

data03.txt
------------------------------
1:1=신정
2:16=설날
3:1=삼일절
5:5=어린이날,8=어버이날
6:6=현충일
8:15=광복절
9:24=추석
10:3=개천절,9=한글날
12:25=크리스마스
------------------------------

2. 데이터 파일을 읽고 다음과 같이 출력되는 프로그램을 작성하시오
프로그램 작성시 데이터파일의 내용을 표현하는 Holiday(월, 일, 제목) 클래스를 작성하시오

출력형식 > 

-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 1
1월
1 - 신정
------------------------
2월
16 - 설날
------------------------
3월
1 - 삼일절
------------------------
5월
5 - 어린이날
8 - 어버이날
------------------------
6월
6 - 현충일
------------------------
8월
15 - 광복절
------------------------
9월
24 - 추석
------------------------
10월
3 - 개천절
9 - 한글날
------------------------
12월
25 - 크리스마스
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 1
1월
1 - 신정
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 2
2월
16 - 설날
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 4
4월
해당 월은 휴일이 존재하지 않습니다.
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 0
종료합니다.

 */
package lec15.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Holiday {
	
	public Holiday(String month, String day, String name){
		this.month = month;
		this.day = day;
		this.name = name;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String month;
	private String day;
	private String name;
	private boolean flag;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}


public class Exam03 {
	static File f = new File("src/lec15/homework/data03.txt");
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(f);
		List<Holiday> list = new ArrayList<>();

		while(sc.hasNextLine()) {
			String s[] = new String[5];
			s =sc.nextLine().replaceAll("[:,=,,]"," ").split(" ");
			if(s.length == 3) {
				Holiday h = new Holiday(s[0],s[1],s[2]);
				list.add(h);				
			}else {
				Holiday h = new Holiday(s[0],s[1],s[2]);
				h.setFlag(true);
				list.add(h);				
				h = new Holiday(s[0],s[3],s[4]);
				list.add(h);
				
			}
		}
		Scanner input = new Scanner(System.in);
		outer:while(true) {
			System.out.println("-------------");
			System.out.println("1. 전체 휴일 보기");
			System.out.println("2. 월별 휴일 보기");
			System.out.println("0. 종료");
			System.out.println("-------------");
			int select = Integer.parseInt(input.nextLine());
			int len = list.size();
			
			switch(select) {
			case 1:
				System.out.println("선택 : "+ select);
				for(int i = 0; i < len ; i++) {
					int ind = i+1;
					Holiday h = list.get(i);
					System.out.printf("%s월%n", h.getMonth());
					System.out.printf("%s - %s%n",h.getDay(),h.getName());						
					if(h.isFlag() && ind < list.size()) {
						
						h = list.get(ind);
						System.out.printf("%s - %s%n",h.getDay(),h.getName());
					}
						System.out.println("------------------------");
				}
				break;
			case 2:
				System.out.println("선택 : "+ select);
				System.out.print("월을 선택하세요 : ");
				int mon = Integer.parseInt(input.nextLine());
				
				for(int i = 0; i < len ; i++) {
					Holiday h = list.get(i);
					if(Integer.parseInt(h.getMonth()) == mon) {
						int ind = i+1;
						System.out.printf("%s월%n", h.getMonth());
						System.out.printf("%s - %s%n",h.getDay(),h.getName());
						if(h.isFlag() && ind < list.size()) {
							
							h = list.get(ind);
							System.out.printf("%s - %s%n",h.getDay(),h.getName());
						}
							System.out.println("------------------------");
							continue outer;
					}
				}
				System.out.println("해당 월은 휴일이 존재하지 않습니다.");
				break;
			case 0:
				System.out.println("선택 : "+ select);
				System.out.println("종료합니다.");
				System.exit(0);
			default:
				continue;
				
			}
			
		}
	}
}
