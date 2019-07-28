package annotation.exam02;

public class Test {
	
//	@FullValue(type="a", name="b", value="c")  // 성공
	// 여러개의 속성과 같이 사용할 경우에는 속성명이 필수
//	@FullValue(type="a", name="b", "c")   // 에러
	
	// default 값이 적용됨
//	@FullValue(name="b")
//	@FullValue
	@FullValue("기본이 value")
	public void call() {}
	
	public static void main(String[] args) {
		
	}
}
