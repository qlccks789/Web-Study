/*
 *   검색어를 입력하세요(종료 : quit) : 트럼프
 *   
 *   블로그 제목    블로그 링크
 *   ---------------------
 *   ...       .....
 *   
 *   검색어를 입력하세요(종료 : quit) : 김정은
 *   
 *   블로그 제목    블로그 링크
 *   ---------------------
 *   ...       .....
 *   
 *   검색어를 입력하세요(종료 : quit) : quit
 *   
 *   프로그램을 종료합니다.
 *   
 */
package net04.xml;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test06 {
	public void execute() {
		String clientId = "xxx";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "xxx";// 애플리케이션 클라이언트 시크릿값";
		try {
			String text = URLEncoder.encode("김정은", "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/blog.xml?display=3&query=" + text; // json 결과
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			if (responseCode == 200) {
//				 원하는 데이터를 출력 
				List<BlogItem> list = 
						getBlogList(con.getInputStream());
				System.out.println("블로그 제목\t블로그 링크");
				System.out.println("------------------------------");
				for (BlogItem item : list) {
					System.out.print(item.getTitle() + "\t");
					System.out.println(item.getLink());
				}
			} else {
				System.out.println("데이터를 가져오지 못했습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private List<BlogItem> getBlogList(InputStream in) throws Exception {
		List<BlogItem> list = new ArrayList<>();
		
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document doc = parser.parse(in);
		NodeList itemList = doc.getElementsByTagName("item");
		for (int i = 0; i < itemList.getLength(); i++) {
			BlogItem blog = new BlogItem();
			Node item = itemList.item(i);
			NodeList childList = item.getChildNodes();
			for (int k = 0; k < childList.getLength(); k++) {
				Node child = childList.item(k);
				String value = child.getTextContent();
				String childName = child.getNodeName();
				
				switch (childName) {
				case "title": blog.setTitle(value); break;
				case "link": blog.setLink(value); break;
				}
			}
			list.add(blog);
		}
		return list;
	}

	public static void main(String[] args) {
		new Test06().execute();
	}
}









