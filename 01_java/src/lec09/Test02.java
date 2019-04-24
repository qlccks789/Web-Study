/**
 *
   상속과 생성자



 *   
 *   - 상속관계가 있는 경우 부모의 생성자가 먼저 호출되어 메모리에 대한 정보를 설정한다. 그다음 자식이 실행
 *   - 생성자내에 this(..) or super(..) -> 호출하는 코드가 존재하지 않으면 super() 가 자동으로 호출된다. 
 */
package lec09;

public class Test02 {
	public static void main(String[] args) {
//		Child c1 = new Child();
		Child c1 = new Child(100);
		
	}
}
