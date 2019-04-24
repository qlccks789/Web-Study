package lec06;

public class Calculator {
	void add(int i, int j){
		System.out.println(i + j);    // -> void 를 하게 되면 받는쪽에서 조작을 할 수 없다.
	}
	
	int add2 (int i, int j ) {
		return i + j;				// -> return 을 하게되면 받는쪽에서 값을 다양한 형태로 출력 할 수 있다.
	}

	
	
	int a = 0;
	int cal(String s, int i , int j ) {
		if (s.equals("+")) {
			a = i+j;
		} else if (s.equals("-")) {
			a = i-j;
		} else if (s.equals("*")) {
			a = i*j;
		} else if (s.equals("/")) {
			a = i/j;
		}
		
		return a; 
	}


	
	/*
	public int cal(String s, int i, int j) {
		int result = 0;
		switch (s) {
		case "+" :
			result = i + j ;
			break;
		case "-" :
			result = i - j ;
			break;
		case "*" :
			result = i * j ;
			break;
		case "/" :
			result = i / j ; 
			break;
		}
		return result;
	}
*/

}





