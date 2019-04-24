/*
 * 	반환타입 중심으로 ... 연습..

 * 
 * 	반환타입이 void 가 아니라면  메서드안에 return이 꼭 나와야 한다.
 * 
 * 	void의 의미 : 메서드는 종료시 호출한 쪽으로 아무 값도 넘기지 않는다.
 * 
 * 	return의 의미 : 
 * 		1. 현재 호출된 메서드의 실행을 종료한다.
 * 		2. 메서드를 호출된 쪽으로 return 뒤에 설정된 값을 넘겨준다.
 * 
 * 	만약, 반환타입이 void라면
 * 		- 메서드는 실행한 다음 호출한 쪽으로 결과값을 넘기지 않고
 * 		- 메서드 내에서 return 문을 선택적으로 사용할 수 있다.
 * 		- 만약, return 문을 사용한다면 return 뒤에 값을 설정하면 안된다.
 * 		  ex> return ;  (o)    return 1;  (x)
 */

package lec06;

import java.util.Random;

public class Method02 {
	
	void m01() {
		System.out.println("m01 : void");
		return ;  // -> 선택적.   void는 값을 주면 에러가 난다.  return 1;  (x)  return ; (o)
	}

//	int m02() {		// 에러 : This method must return a result of type int : 메서드의 타입이 void가 아니라면 메서드가 끝나기전에 return 문장을 명시해야함.
//		System.out.println("m02 : void");
//	}

//	int m02() {		// return 뒤에 반환타입에 설정한 타입이 받을 수 있는 값을 줘야 한다.ex> int -> return 1; 
//		System.out.println("m02 : int");
//		return ;
	
	int m02() {
		System.out.println("m02 : int");
		return 97;			// -> m02를 호출한 쪽에 97 이라는 값을 넘겨준다는 뜻.
		
//		System.out.println("m02 : end"); // 에러 : Unreachable code  -> return 이 되면 종료하기때문에(return의 의미 1) 에러가 나옴.
		
	}

	char m03() {
		System.out.println("m03 : char");
		return 'a';
	}
	
	String m04() {
		System.out.println("m04 : String");
		return "b";
	}
	
	int[] m05() {
		System.out.println("m05 : int[]");
		return new int[3];
	}
	
	Random m06() {
		System.out.println("m06 : Random");
		return new Random();
	}
	
	HaHa van(KiKi kiki) {
		
		return new HaHa();
		
	}
	
}
class HaHa{
	 
		
	}
class KiKi{
	
}
	
