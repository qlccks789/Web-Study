package kr.co.mlec.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
	
	// 실행시간 측정 공통 기능
	@Around("execution(* kr.co.mlec..*Controller.service(..))")
	public Object executeTime(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("실행시간 측정");
		// 시작
		
		Object result = null;
		
		long s = System.currentTimeMillis();
		
		// around 방식일 경우에는 핵심기능 클래스의 메서드를 직접 호출해야 한다.
		try {
			result = pjp.proceed();
		} finally {
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("실행시간 : " + time);
		}
		
		// 종료
		return result;
	}
}








