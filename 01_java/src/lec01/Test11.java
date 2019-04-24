/*
 *   문자열("") : String   


 *   정수 : int(대표) 
 *   실수 : double(대표)
 */

package lec01;

public class Test11 {
	public static void main(String[] args) {
		// 문자열 -> 정수, "11"  -> 11
		// Integer.parseInt(문자열)
		// Integer.parseInt("200")
		// 문자열 -> 실수, "1.1" -> 1.1
		// Double.parseDouble(문자열)
		// Double.parseDouble("1.1")
		// NumberFormatException -> 숫자로 변경 불가능한 문자열일 경우 발생
		/*
		System.out.println(
			Integer.parseInt("강남") + 200
		);
		*/
		System.out.println(
			Integer.parseInt("200") + 200
		);
		System.out.println(
			Double.parseDouble("1.1") + 200
		);
	}
}




