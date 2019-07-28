package annotation.exam03;

@MyTarget
public class Test {
	
	@MyTarget
	private String msg;
	
	@MyTarget
	public void test(@MyTarget String msg) {}
}
