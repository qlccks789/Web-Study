/**
 * 네트워크(2대 이상의 원격지 컴퓨터를 연결)
 * 
 * 용어
 * - 소켓(socket)
 *   : 컴퓨터가 연결된 통신의 끝점
 *   : 소켓에 쓰는 일은 상대에게 데이터를 전달
 *   : 소켓에서 읽는 일은 상대가 전송한 데이터를 수신하는 것
 * - 대표적인 자바에서 사용하는 소켓은 TCP(전화)와 UDP(편지)를 이용한다.
 * - 웹은 소켓 통신을 TCP를 사용한다.
 * 
 * - 호스트(Host)
 *   : 하나의 컴퓨터에 할당된 고유 이름
 *   : 인터넷 상에서 IP 주소나 도메인명으로 나타낸다.
 *   
 * - 포트(Port)
 *   : 한 컴퓨터에서 여러 서비스의 제공을 가능하게 함
 *   : 한 컴퓨터에서 제공해 주는 여러 서비스를 구분하기 위해서 사용 
 *   : 포트번호는 0 ~ 65535 사용가능함(권장은 5000 번 이후 사용, 0 ~ 1023 시스템)
 *   : 대표전화(host), 내선번호(port)
 *   : 웹의 기본 포트는 80 포트임
 *   
 * - 자바의 java.net 패키지 : 네트웤관련
 *   : InetAddress, URL, HttpURLConnection, TCP(ServerSocket, Socket)   
 */
package net01.ip;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {
		try {
			// InetAddress
			// 현재 컴퓨터의 주소 얻기
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
//			InetAddress jun2 = InetAddress.getByName("www.jun2food.com");
			InetAddress jun2 = InetAddress.getByName("www.98383874.com");
			System.out.println(jun2);
			
			InetAddress[] addrs = InetAddress.getAllByName(
					"www.naver.com"
			);
			System.out.println("-------------------");
			for (InetAddress addr : addrs) {
				System.out.println(addr);
			}
			System.out.println("-------------------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}














