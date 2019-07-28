package net06.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test03 {
	public static void main(String[] args) {
		try {
			
			Document doc = Jsoup.connect("http://www.7-eleven.co.kr/event/eventList.asp").get();
			
			Elements events = doc.select("#listUl > li > .event_over > dl");
			System.out.println("7-eleven  진행중인 이벤트 정보");
			System.out.println("--------------------------------------------");
			System.out.printf("%-40s%s%n", "이벤트 기간", "제목");
			System.out.println("--------------------------------------------");
			for (Element event : events) {
				System.out.print(event.selectFirst("dd.date").text() + "\t");
				System.out.println(event.selectFirst("dt").text());
			}
			System.out.println("--------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
