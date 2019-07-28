package net06.crawling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06 {
	
	// WebDriver는 로컬 또는 원격 컴퓨터의 브라우져를 구동할 수있게 하는 테스트 도구입니다.
	private WebDriver driver;
	
	private void init() {
        System.setProperty(
        		"webdriver.chrome.driver", 
        		"C:\\bit2019\\bin\\crawling\\chromedriver.exe"); //크롬 드라이버 파일 경로설정
        driver = new ChromeDriver();
        // 웹 자원 로딩까지 5초 기다림, 응답시간 5초설정
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	}
	
	public void execute() throws Exception {
		init();
		
		///*
		// iframe로 설정되어 있음
//		driver.get("https://www.daum.net/");  // 접속할 사이트
		driver.get("https://logins.daum.net/accounts/toploginform.do");  // 접속할 사이트
		System.out.println(driver.getPageSource());
		driver.findElement(By.id("id")).sendKeys("입력할 값");
		driver.findElement(By.id("inputPwd")).sendKeys("입력할 값");
		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(100);
		driver.get("http://ticket.interpark.com/");  // 접속할 사이트
		driver.findElement(By.id("Nav_SearchWord")).sendKeys("포스트시즌");
		driver.findElement(By.cssSelector(".btn_search")).click();
		
	}
	
	public static void main(String[] args) {	
		try {
			new Test06().execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
