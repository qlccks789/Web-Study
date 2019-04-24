package lec12;

/*
 *  Exception(String msg)
 */
public class LottoException extends Exception{
//public class LottoException extends RuntimeException {
	public LottoException () {
		super("잘못된 로또번호 입니다.(1 ~ 33)");		// 부모클래스에 있는 메세지를 사용한다..
	}
	
	public LottoException (int num) {
		super(num + "은 잘못된 로또번호 입니다.(1 ~ 33)");	// 
	}





}
