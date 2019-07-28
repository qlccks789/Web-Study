package kr.co.mlec.di._10component;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {
	
	@Autowired
	private Sand sand;
	
	public void print() {
		if (sand == null) {
			System.out.println("sand 객체 주입 실패");
			return ;
		}
		sand.info();
	}
	
}











