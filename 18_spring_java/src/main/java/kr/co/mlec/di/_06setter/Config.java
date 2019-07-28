package kr.co.mlec.di._06setter;

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
		Menu menu = new Menu();
		menu.setDesc("샌드위치 : 햄");
		return menu;
	}
	
	@Bean(name="menu3")
	public Menu getMenu3() {
		Menu menu = new Menu();
		menu.setSand(hamSand());
		return menu;
	}
}
