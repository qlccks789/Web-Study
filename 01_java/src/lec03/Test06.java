package lec03;

public class Test06 {
	public static void main(String[] args) {
		/*
		 *   switch문 : 값이 같은지..
		 *   
		 *   수식 자리에 올 수 있는것 
		 *   : byte, short, char, int
		 *   : enum(1.5 버전 부터 가능해짐)
		 *   : String(1.7 버전 부터 가능해짐)
		 *   
		 *   switch (수식) {
		 *   	case 값1:
		 *   		수식과 값1 이 같은 경우 
		 *   		실행문장들;
		 *   		실행문장들;
		 *   		[break;] <- switch 블럭을 벗어나라..
		 *   	case 값2:
		 *   		수식과 값2 이 같은 경우 
		 *   		실행문장들;
		 *   		실행문장들;
		 *   	case ...:
		 *   		....;
		 *   	default:  // if문의 else와 같은 역활
		 *   		case조건을 모두 만족하지 않으면 여기서 처리됨..
		 *   }
		 *   
		 *   int a = 1;
		 *   switch (a) {
		 *   	case 1:
		 *   		System.out.println("1");
		 *   	case 2:
		 *   		System.out.println("2");
		 *   	...
		 *   }
		 */
		int a = 1;
		switch (a) {
		case 1: 
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
		default:
			System.out.println(3);
		}
	}
}