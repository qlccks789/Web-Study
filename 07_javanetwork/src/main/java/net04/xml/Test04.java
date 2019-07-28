/**
<?xml version="1.0" encoding="UTF-8"?>
<result>
	<message><![CDATA[ok]]></message>
	<result>
		<hash><![CDATA[GoafhJkt]]></hash>
		<url><![CDATA[http://me2.do/GoafhJkt]]></url>
		<orgUrl><![CDATA[http://sports.chosun.com/news/ntype5.htm?id=201803220100165250012095&ServiceDate=20180321]]></orgUrl>
	</result>
	<code><![CDATA[200]]></code>
</result>  
 */
package net04.xml;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test04 {
	
	private static String xmlParsing(InputStream in) throws Exception {
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document doc = parser.parse(in);
		NodeList list = doc.getElementsByTagName("url");
		Node node = list.item(0);
		return node.getTextContent();
	}
	
	public static void main(String[] args) {
        String clientId = "xxx";
        String clientSecret = "xxx";
        try {
        	String orgUrl = URLEncoder.encode("http://sports.chosun.com/news/ntype5.htm?id=201803220100165250012095&ServiceDate=20180321", "utf-8");
            String apiURL = "https://openapi.naver.com/v1/util/shorturl.xml";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            String postParams = "url=" + orgUrl;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            System.out.println(responseCode);
            
            if (responseCode == 200) {
        		System.out.println(
        			"단축URL : " + 
        		    xmlParsing(con.getInputStream())
        		);
            } else {
            	System.out.println("정보를 가져오지 못했습니다.");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}











