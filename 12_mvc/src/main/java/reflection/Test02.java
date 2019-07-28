package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		try {
//			exam01();
//			exam02();
//			quiz01();
			quiz02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Dog 클래스의 메서드 중에서 반환타입이 void 이고 set으로 시작하는 메서드의 이름을 화면에 출력
	 */
	private static void quiz02() throws Exception {
		for (Method m : Dog.class.getDeclaredMethods()) {
			String name = m.getName();
			if (!name.startsWith("set")) continue;
			if (!m.getReturnType().getName().equals("void")) continue;
			
			System.out.println(name);
		}
	}
	
	
	
	
	
	/**
	 * ArrayList에 있는 메서드 중에서 "i"로 시작하는 
	 * 메서드의 이름을 화면에 출력
	 * @throws Exception
	 */
	private static void quiz01() throws Exception {
		Class<?> clz = ArrayList.class;
		Method[] mArr = clz.getDeclaredMethods();
		for (Method method : mArr) {
			String mName = method.getName();
			if (!mName.startsWith("i")) continue;
			
			System.out.println(mName);
		}	
	}
	
	// 특정 메서드 접근하기
	private static void exam02() throws Exception {
		Class<?> clz = Dog.class;
		
//		Method m = clz.getDeclaredMethod("setName", String.class);
		
		// setAge
		Method m = clz.getDeclaredMethod("setAge", int.class);
		
		System.out.println("-------------------------");
		System.out.println("메서드명 : " + m.getName());
		Class<?> rClz = m.getReturnType();
		System.out.println("반환타입 : " + rClz.getName());
		System.out.println("파라미터");
		System.out.println("********************");
		Parameter[] pArr = m.getParameters();
		for (Parameter p : pArr) {
			// String name
			Type t = p.getParameterizedType();
			System.out.println(
				t.getTypeName() + " " + p.getName()
			);
		}
	}

	// Class 객체의 메서드 정보 확인
	private static void exam01() {
		Class<?> clz = Dog.class;
		
		Method[] mArr = clz.getDeclaredMethods();
		System.out.println("Dog 클래스의 메서드 수 : " + mArr.length);
		
		for (Method m : mArr) {
			System.out.println("-------------------------");
			System.out.println("메서드명 : " + m.getName());
			Class<?> rClz = m.getReturnType();
			System.out.println("반환타입 : " + rClz.getName());
			System.out.println("파라미터");
			System.out.println("********************");
			Parameter[] pArr = m.getParameters();
			for (Parameter p : pArr) {
				// String name
				Type t = p.getParameterizedType();
				System.out.println(
					t.getTypeName() + " " + p.getName()
				);
			}
		}
	}
}














