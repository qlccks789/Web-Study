package net06.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test02 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
//			System.out.println(doc.html());

			Elements list = doc.select("ul.ah_l > li > a[href='#']");
			System.out.println("-------------------------");
			for (Element e : list) {
//				System.out.println(e.html());
				// <span class="ah_r">1</span> <span class="ah_k">방용훈</span>
				Elements spanList = e.select("span");
				Element rank = spanList.get(0);
				Element keyword = spanList.get(1);
				System.out.println(rank.text() + "\t" + keyword.text());
			}
			System.out.println("-------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








