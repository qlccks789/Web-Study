package net04.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test01 {
	public static void main(String[] args) {
		// DOM Parser 를 활용한 xml(data1.xml) 이용
		try {
			// DOM Parser -> DocumentBuilder
			// 1단계. 파서를 생성하는 Factory 클래스 객체 얻기
			DocumentBuilderFactory factory = 
					DocumentBuilderFactory.newInstance();
			
			// 2 단계. factory로 부터 파서 객체 얻기
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			// 3 단계. 파서에게 xml 문서를 파싱하게 한다.
			Document doc = parser.parse("data1.xml");
			
			// 4단계. 원하는 엘리먼트 접근하기
			NodeList list = doc.getElementsByTagName("family");
			System.out.println(list.getLength());
			
			// 5단계. 데이터 활용하기
			for (int i = 0; i < list.getLength(); i++) {
				Node family = list.item(i);
				System.out.println(family.getTextContent());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












