package net04.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test02 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = 
					DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document doc = parser.parse("data2.xml");
			
			NodeList list = doc.getElementsByTagName("family");
			System.out.println(list.getLength());
			
			for (int i = 0; i < list.getLength(); i++) {
				Node family = list.item(i);
//				System.out.println(family.getTextContent());
				NodeList childList = family.getChildNodes();
//				System.out.println(childList.getLength());
				// 텍스트 노드 제외하고 엘리먼트 노드만 대상으로 처리하자..
				for (int k = 0; k < childList.getLength(); k++) {
					Node child = childList.item(k);
					String name = child.getNodeName();
					if ("#text".equals(name)) continue;
					
					System.out.println(name + " : " + child.getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













