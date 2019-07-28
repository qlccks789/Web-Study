package reflection;

public class Test01 {
	public static void main(String[] args) {
		try {
			exam01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 리플렉션을 활용하기 위해서는 클래스 정보에 접근해야 한다.
	 * 
	 * 3가지 방식으로 접근
	 * @throws Exception
	 */
	private static void exam01() throws Exception {
		// 1번 방식 : 클래스이름.class
		Class<?> clz = Dog.class;
		
		// 2번 방식 : Class.forName("패키지이름 포함 클래스명")
		Class<?> clz2 = Class.forName("reflection.Dog");
		
		// 3번 방식 : 객체.getClass()
		Dog dog = new Dog();
		Class<?> clz3 = dog.getClass();
		
		System.out.println(clz == clz2);
		System.out.println(clz2 == clz3);
		
		// Class 클래스의 메서드
		// 클래스의 이름 가져오기 : getName(), getSimpleName()
		System.out.println(clz.getName());
		System.out.println(clz.getSimpleName());
	}
}





















