/*
 * 출력형식 > 
 * 도메인 주소를 입력하세요 : http://www.naver.com
 * 도메인 주소는 www로 시작해야 합니다.
 * 
 * 도메인 주소를 입력하세요 : www.naver.com
 * www.naver.com 에서 사용하는 주소정보
 * ---------------------------------------
 * 220.189.20.111 
 * 220.189.20.64 
 * ---------------------------------------
 * 
 * 도메인 주소를 입력하세요 : www.aidfjeijf.com
 * 존재하지 않는 도메인 주소 입니다.
 * 
 * 도메인 주소를 입력하세요 : exit
 * 프로그램을 종료합니다.
 */

package net01.ip;

import java.net.InetAddress;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("도메인 주소를 입력하세요 : ");
			String addr = sc.nextLine();
			
			if (addr.equals("exit")) break;
			
			if (addr.startsWith("www") == false) {
				System.out.println("도메인 주소는 www로 시작해야 합니다.");
				continue;
			}
			
			try {
				InetAddress[] addrs = InetAddress.getAllByName(addr);
				System.out.println(addr + "에서 사용하는 주소정보");
				System.out.println("---------------------------------------");
				for (InetAddress ia : addrs) {
					System.out.println(ia.getHostAddress());
				}
				System.out.println("---------------------------------------");
			} catch (Exception e) {
				System.out.println("존재하지 않는 도메인 주소 입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}

















