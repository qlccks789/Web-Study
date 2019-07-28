package kr.co.mlec.di._07collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="ham")
	public Sand getHamSand() {
		return new HamSand();
	}
	@Bean(name="cheese")
	public Sand getCheeseSand() {
		return new CheeseSand();
	}
	@Bean(name="egg")  // 설정을 하지 않으면 호출 될 때마다 객체를 계속 생성한다.
	public Sand getEggSand() {
		return new EggSand();
	}
	@Bean(name="menu")
	public Menu getMenu() {
		Menu menu = new Menu();
		List<Sand> sandList = new ArrayList<>();
		sandList.add(getHamSand());
		sandList.add(getEggSand());
		sandList.add(getCheeseSand());
		menu.setSandList(sandList);
		
		Set<Sand> sandSet = new HashSet<>();
		sandSet.add(getHamSand());
		sandSet.add(getEggSand());
		sandSet.add(getCheeseSand());
		menu.setSandSet(sandSet);
		
		Map<String, Sand> sandMap = new HashMap<>();
		sandMap.put("ham", getHamSand());
		sandMap.put("egg", getEggSand());
		sandMap.put("cheese", getCheeseSand());
		menu.setSandMap(sandMap);
		
		Properties prop = new Properties();
		prop.put("ham", "햄 샌드위치");
		prop.put("cheese", "치즈 샌드위치");
		prop.put("egg", "계란 샌드위치");
		menu.setSandProp(prop);		
		
		return menu;
	}
}





















