package kr.co.mlec.di._04container;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 컨테이너가 설정파일의 빈을 로딩하는 과정...
		// di/04container/test.xml 설정정보 파일
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"config/di/04container/test.xml"
		);
		System.out.println("설정파일 로딩 끝났음..");
		
		// 같은 아이디로 객체를 찾게 되면 동일한 객체를 넘겨준다.(싱글톤)
//		Sand sand = (Sand)container.getBean("ham");
//		Sand sand = container.getBean("ham", Sand.class);
		
		// Sand 타입의 빈이 여러개일 경우 에러발생
//		Sand sand = container.getBean(Sand.class);

		Sand sand = container.getBean(HamSand.class);
		sand.info();

		Sand eggSand = container.getBean("egg3", EggSand.class);
		eggSand.info();
		
		/*
		Sand sand2 = (Sand)container.getBean("ham");
		System.out.println("객체 찾기 끝났음");
		sand2.info();
		*/
		
		// bean 태그의 destroy-method 속성에 설정된 메서드가 실행된다.
		container.close();
	}
}














