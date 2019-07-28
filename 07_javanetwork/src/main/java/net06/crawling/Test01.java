package net06.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01 {
	public static void main(String[] args) {
		// HTML 파싱 라이브러리 : jsoup
		String html = "<html>"
				    + "  <head>"
				    + "    <title>jsoup 연습</title>"
				    + "  </head>"
				    + "  <body>"
				    + "    <p>Parse HTML</p>"
				    + "    <div class='a'>클래스 접근</div>"
				    + "    <p id='b'>아이디 접근</p>"
				    + "    <div>"
				    + "      <p>div 안에 있는 p</p>"
				    + "      <a href='#1'>위로</a>"
				    + "      <a href='#2'>아래로</a>"
				    + "      <a href='#3'>중간</a>"
				    + "      <a href='http://www.naver.com'>네이버</a>"
				    + "    </div>"
				    + "  </body>"
				    + "</html>";
		Document doc = Jsoup.parse(html);
		/*
		Elements list = doc.select("div");
		Elements list = doc.select("p");
		Elements list = doc.select("div.a");
		Elements list = doc.select("body > div > a");
		Elements list = doc.select("body > div > a[href^='#']");
		Elements list = doc.select("body > div > a[href*='naver']");
        */

		Elements list = doc.select("body > div > a[href$='com']");
		for (Element e : list) {
			System.out.println("----------------");
			System.out.println(e.html());
//			System.out.println(e.text());
		}
		
		/*
		Element e = doc.selectFirst("#b");
		System.out.println(e.html());
		
		Element e = doc.getElementById("b");
		System.out.println(e.html());
		 */
	}
}






























