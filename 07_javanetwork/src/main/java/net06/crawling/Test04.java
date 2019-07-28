package net06.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test04 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.daum.net").get();
			Elements elements = doc.select("ul.list_weather > li.hide");
			for (Element e : elements) {
				String part = e.select(".txt_part").html();
				String wm = e.select("strong.img_weather").html();
				String temper = e.select("span.txt_temper").html();
				String screen = e.select(".ir_wa").html();
				System.out.println(part + " " + wm + " " + temper + screen);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
