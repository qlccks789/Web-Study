package reflection;

import java.lang.reflect.Method;

public class Test03 {
	public static void main(String[] args) {
		try {
//			exam01();
			exam02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 리플렉션을 이용한 메서드 실행하기
	private static void exam02() throws Exception {
		/*
		Dog dog = new Dog();
		dog.setName("쫑");
		String name = dog.getName();
		System.out.println(name);
		*/
		Class<?> clz = Dog.class;
		Object obj = clz.newInstance();
		Method method = clz.getDeclaredMethod("setName", String.class);
		// 메서드 실행하기
		method.invoke(obj, "쫑");
		
		// getName 메서드 실행하기
		method = clz.getDeclaredMethod("getName");
		Object value = method.invoke(obj);
		String name = (String)value;
		System.out.println(name);
	}

	// 리플렉션을 이용한 클래스 객체를 생성
	private static void exam01() throws Exception {
		Class<?> clz = Dog.class;
		
		/*
		Object obj = new Dog();
		Dog dog = (Dog)obj;
		 */
//		Object obj = clz.getDeclaredConstructor().newInstance();
		Object obj = clz.newInstance();
		Dog dog = (Dog)obj;
		dog.setName("리플렉션");
		System.out.println(dog.getName());
	}
}














