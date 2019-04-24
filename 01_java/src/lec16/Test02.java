package lec16;

import java.io.Serializable;

class MyRunnable implements Runnable {
	public void run() {	// 오버라이딩을 해줘야 한다.
		System.out.println("재정의된 run()");
	}
}
class MyThread extends Thread {}

class MySerial implements Serializable {}

public class Test02 {
	private static void b(Serializable t) {}
	private static void a(Thread t) {}
	public static void main(String[] args) {
		b(new MySerial());
		b(new Serializable() {
			public void work() {}
		});
		
//		b(new MyRunnable());
		
		
		
		
		
		
		
		
		
		
		
		Thread t1 = new Thread();
		a(t1);
		a(new Thread());
		
		Thread t3 = new Thread(){};
		a(t3);

		a(new Thread(){});
		
		Thread t2 = new MyThread();
		a(t2);
		
		a(new MyThread());
		
		
		
		/*
		// Thread(Runnable)
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		 */
		
		// Runnable 상속하는 익명클래스
		/*
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("재정의된 run()");
			}
		};
		Thread t = new Thread(r);
		*/
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("재정의된 run()");
			}
		});

		// 1.8 람다식 : 자바스크립트(화살표 함수와 유사)
		Thread t4 = new Thread(
			() -> System.out.println("재정의된 run()")
		);
		
		
		// 익명클래스 : 클래스 정의 + 생성
		// new 클래스 or 인터페이스() {
		//    변수, 메서드..
		// };
	}
}









