package annotation.exam01;

@Marker
public class Test {
	
	@Marker
	private String msg;
	
	@Marker
	public void call() {}
	
	@Type1(value="hello")
	@Type2(name="hi")
	public void test() {}
	
	// Single-Value 일 경우 속성명이 value 인경우는 속성명을 생략할 수 있다.
	@Type1("hello")
//	@Type2("hi")
	public void test2() {}
	
	public static void main(String[] args) {
		
	}
}











