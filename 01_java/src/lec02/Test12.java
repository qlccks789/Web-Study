// 비교연산자 : 연산의 결과가 true, false

// >, <, >=, <=, ==, !=
// 논리연산자 : &&(and), ||(or)
// 배정연산자(대입연산자) : +=, -=, *=, /= ..
package lec02;

public class Test12 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		System.out.println(num1 >  num2); // true
		System.out.println(num1 <  num2); // false
		System.out.println(num1 >= num2); // true
		System.out.println(num1 <= num2); // false
		System.out.println(num1 != num2); // true
		System.out.println(num1 == num2); // false
		
		// 조건식(true/false) && 조건식(true/false)
		// 양쪽 조건식이 모두 참일 경우 참을 반환
		/*         &&
		 *   True      True  ->   True
		 *   True      False ->   False
		 *   False     True  ->   False
		 *   False     False ->   False
		 */

		// 조건식(true/false) || 조건식(true/false)
		// 둘중에 하나만 참이면 참을 반환
		/*         ||
		 *   True      True  ->   True
		 *   True      False ->   True
		 *   False     True  ->   True
		 *   False     False ->   False
		 */
		
		int a = 5;
		int b = 3;
		
		boolean bool = (a == 5) || (++b == 4);
		System.out.println("------------------");
		System.out.println(bool);
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * 
		 *   a += b;  -> a = a + (b);
		 * 
		 *   int a = 5;
		 *   a *= 5 - 2;  -> a = 5 * (5 - 2); 
		 */
		int k = 5;
		// k 변수에 1을 더하라..
		k = k + 1;
		k += 1;
		k++;
		
		// k 변수에 3을 더하라..
		k = k + 3;
		k += 3;
		
	}
}
















