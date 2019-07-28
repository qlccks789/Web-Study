package kr.co.mlec.di._08autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// <context:annotation-config /> 의 역활은 Configuration에서 내부적으로 처리되기 때문에 별도의 작업 필요 없음
@Configuration
public class Config {
	
	@Bean("ham")
	public Sand getHamSand() {
		return new HamSand();
	}
	
	@Bean("cheese")
	@Qualifier("ch")
	public Sand getCheeseSand() {
		return new CheeseSand();
	}
	
	@Bean("menu")
	public Menu getMenu() {
		return new Menu();
	}
}
