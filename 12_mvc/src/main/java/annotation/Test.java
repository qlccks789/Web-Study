/*
 	어노테이션(Annotation)
 	- 클래스, 메서드, 변수등에 추가적인 데이터(메타데이터)를 붙이는 방식
 	- XML 설정 부분을 대체
 	  <servlet>                    @WebServlet(...)
 	    <servlet-name>...</...>
 	    <servlet-class>...</...>
 	  </servlet>
 	  <servlet-mapping>
 	    <servlet-name>...</...>
 	  	<url-pattern>...</...>
 	  </servlet-mapping>
   	- 동적으로 클래스나 메서드에 필요한 메타 정보를 설정하고 이용한다
   	  : 리플렉션이 이용된다.
    - 어노테이션을 활용하는 대표적인 프레임워크
      : spring, struts2, mybatis
      
      
    - 생성규칙
      1. interface 키워드와 함께 @로 시작하고 이름을 명시한다.
         @interface Over {
         	String value();
         }
      2. 메서드에 파라미터를 선언할 수 없다.
      3. 메서드에 throws 를 선언할 수 없다.   
      
    - Built-In Annotation  
      // 사용자가 어노테이션을 정의할 때 사용되는 어노테이션(메타어노테이션)
      1. @Target
         : 사용자가 정의하는 어노테이션이 어느 위치에 적용될 수 있는지..
         
      2. @Retention
      	 : 사용자가 정의하는 어노테이션을 언제까지 유지하게 할 지...
      	 : SOURCE, CLASS, RUNTIME(개발시 주로 사용됨..)
      	 
    - 3가지 Annotation 타입
      1. Marker
      	 @interface MyAnno {}
      	 
      2. Single-Value
      	 @interface MyAnno {
      	 	String value();
      	 }

      3. Full-Value or Multi-Value
      	 @interface MyAnno {
      	 	String value();
      	 	String name();
      	 }
      
 */
package annotation;


public class Test {
	public void test() {
		
	}
}













