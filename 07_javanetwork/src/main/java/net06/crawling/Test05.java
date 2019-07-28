// selenium 활용 : 페이지에 동적으로 채워지는 데이터를 조회할 수 있음..
// 크롬 드라이버 다운로드
// - selenium 사이트(http://www.seleniumhq.org/) 접속 후...
// - 특정 경로에 복사 : C:\bit2019\bin\crawling\chromedriver.exe
//                 C:\program-bin\crawling\chromedriver.exe
package net06.crawling;

import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test05 {
	public static void main(String[] args) {
		try {
			// 크롬드라이버 로딩, 옵션 설정하기
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:\\bit2019\\bin\\crawling\\chromedriver.exe"
			);
			
			// 로컬 또는 원격 컴퓨터의 브라우져를 구동시킬 수 있는 도구
			WebDriver driver = new ChromeDriver();
			
			// 웹 자원 로딩시 5초까지 기다리도록 설정
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("http://www.monstermart.net/");
			
			Thread.sleep(100);
			
			String pageSource = driver.getPageSource();

			Document doc = Jsoup.parse(pageSource);	
			Elements elements = doc.select(
				"#scroll_list_108 .owl-item > .ty-scroller-list__item"
			);

			for (int i = 0; i < elements.size() - 1; i++) {
				Element element = elements.get(i);
				System.out.println("-----------------------------");
				System.out.println(i + 1);
				Element imgElement = element.selectFirst("img.ty-pict");
				String src = imgElement.attr("src");
				System.out.println(src);
				Element aElement = element.selectFirst("a.product-title");
				String title = aElement.attr("title");
				System.out.println(title);
			}
			
			driver.quit();
//			Document doc = Jsoup.connect("http://www.monstermart.net/").get();
//			System.out.println(doc.html());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	public static void main(String[] args) {
		try {
			// 크롬드라이버 로딩, 옵션 설정하기
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:\\bit2019\\bin\\crawling\\chromedriver.exe"
					);
			
			// 로컬 또는 원격 컴퓨터의 브라우져를 구동시킬 수 있는 도구
			WebDriver driver = new ChromeDriver();
			
			// 웹 자원 로딩시 5초까지 기다리도록 설정
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("http://www.monstermart.net/");
			
			Thread.sleep(100);
			
			String pageSource = driver.getPageSource();
//			System.out.println(pageSource);
			
			List<WebElement> elements = driver.findElements(
					By.cssSelector(
							"#scroll_list_108 .owl-item > .ty-scroller-list__item"
							)
					);
			for (int i = 0; i < elements.size() - 1; i++) {
				WebElement element = elements.get(i);
				System.out.println("-----------------------------");
				System.out.println(i + 1);
				WebElement imgElement = element.findElement(
						By.cssSelector("img.ty-pict")
						);
				String src = imgElement.getAttribute("src");
				System.out.println(src);
				WebElement aElement = element.findElement(
						By.cssSelector("a.product-title")
						);
				String title = aElement.getAttribute("title");
				System.out.println(title);
			}
			
			driver.quit();
//			Document doc = Jsoup.connect("http://www.monstermart.net/").get();
//			System.out.println(doc.html());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
}













