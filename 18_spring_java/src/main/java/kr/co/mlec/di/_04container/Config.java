package kr.co.mlec.di._04container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	// 한번만 객체 생성하고 같은걸 사용한다.. : 내부적으로 처리한다...
//	@Bean(value="ham", name={"ham2","ham3","ham4"})  // 에러 같이 사용 안됨
//	@Bean(value={"ham","ham2","ham3","ham4"})
	@Bean(name="ham")
	public Sand hamSand() {
		return new HamSand();
	}

	@Bean(name={"egg","egg2","egg3","egg4", "egg5"}, 
		initMethod="init",
		destroyMethod="destroy")
	public Sand eggSand() {
		return new EggSand();
	}
}
