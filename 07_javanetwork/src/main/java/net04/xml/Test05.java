// openapi > Test01 소스 참조
// 블로그 정보 중에서 제목과 링크 를 화면에 출력하는 프로그램 작성
// 블로그 정보를 담는 BlogItem 클래스 작성
// 리스트에 BlogItem 정보를 담는다.
// 리스트에 담겨있는 정보를 화면에 출력한다.
/*
 *   블로그 제목    블로그 링크
 *   ---------------------
 *   ...       .....
 *   
		<item>
			<title>호치민과 &lt;b&gt;김정은&lt;/b&gt;</title>
			<link>https://blog.naver.com/jesusaidtou?Redirect=Log&amp;logNo=221480502580
			</link>
			<description>&lt;b&gt;김정은&lt;/b&gt;이 청운의 부푼꿈을 안고 하노이에 왔다가 다시 북한으로
				돌아갔다. 기차로 60여시간 중국대륙을... &lt;b&gt;김정은&lt;/b&gt;의 청사진은 무엇이었을까? 첫번째는
				북미1차회담장소인 싱가포르였을 것이다. &lt;b&gt;김정은&lt;/b&gt;의 첫번째... </description>
			<bloggername>사막의 생수</bloggername>
			<bloggerlink>https://blog.naver.com/jesusaidtou</bloggerlink>
			<postdate>20190305</postdate>
		</item>   
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

public class Test05 {
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
		new Test05().execute();
	}
}









