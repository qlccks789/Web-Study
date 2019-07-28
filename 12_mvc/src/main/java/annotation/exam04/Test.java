package annotation.exam04;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		Class<?> clz = AnnoApply.class;
		
		ClassAnno cAnno = clz.getAnnotation(ClassAnno.class);
		System.out.println(cAnno);
		
		RunAnno1 rAnno = clz.getAnnotation(RunAnno1.class);
		System.out.println(rAnno.value());
		
		// AnnoApply 클래스에 선언된 모든 메서드 
		Method[] mArr = clz.getDeclaredMethods();
		// 메서드 중에서 RunAnno2가 선언된 메서드를 찾는다.
		for (Method m : mArr) {
			RunAnno2 anno = 
					m.getAnnotation(RunAnno2.class);
			if (anno == null) continue;
			
			// RunAnno2 가 선언된 메서드일 경우
			System.out.println(
					"메서드명 : " + m.getName());
			System.out.println(anno.id());
			System.out.println(anno.msg());
		}		
		
		
		/*
		Annotation[] arr = clz.getAnnotations();
		System.out.println(arr.length);
		Annotation anno = arr[0];
		System.out.println(anno);
		RunAnno1 rAnno = (RunAnno1)anno;
		System.out.println(rAnno.value());
		*/
	}
}















