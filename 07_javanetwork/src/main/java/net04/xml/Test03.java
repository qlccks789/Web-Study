package net04.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test03 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = 
					DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document doc = parser.parse("data2.xml");
			
			NodeList list = doc.getElementsByTagName("family");
			System.out.println(list.getLength());
			
			List<Family> familyList = new ArrayList<>();
			
			for (int i = 0; i < list.getLength(); i++) {
				Family f = new Family();
				Node family = list.item(i);
				NodeList childList = family.getChildNodes();
				for (int k = 0; k < childList.getLength(); k++) {
					Node child = childList.item(k);
					String name = child.getNodeName();
					if ("#text".equals(name)) continue;
					
					// 리스트에 데이터를 입력하는 코드 추가
					String value = child.getTextContent();
					switch (name) {
					case "father": f.setFather(value); break;
					case "mother": f.setMother(value); break;
					case "me": f.setMe(value); break;
					}
					
				}
				familyList.add(f);
			}
			
			
			
			// 리스트에 입력된 데이터들을 화면에 출력
			/*
			 *   father  mother  me
			 *   ---------------------
			 *   다스베이더  파드메       루크
			 *   ....
			 *   양현석        산다라박    승리
			 */
			System.out.println("father\tmother\tme");
			System.out.println("--------------------------");
			for (Family data : familyList) {
				System.out.print(data.getFather() + "\t");
				System.out.print(data.getMother() + "\t");
				System.out.println(data.getMe());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













