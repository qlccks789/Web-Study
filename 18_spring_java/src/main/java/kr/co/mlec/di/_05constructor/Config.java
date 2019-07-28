package kr.co.mlec.di._05constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Sand hamSand() {
		return new HamSand();
	}

	@Bean(name="menu1")
	public Menu getMenu1() {
		return new Menu();
	}
	@Bean(name="menu2")
	public Menu getMenu2() {
		return new Menu("샌드위치 : 햄");
	}
	@Bean(name="menu3")
	public Menu getMenu3() {
		return new Menu(hamSand());
	}
}
