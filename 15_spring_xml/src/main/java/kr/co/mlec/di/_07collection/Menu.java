package kr.co.mlec.di._07collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu {
	
	private Properties sandProp;
	public void setSandProp(Properties sandProp) {
		System.out.println("setSandProp 호출됨");
		this.sandProp = sandProp;
	}
	public void printProp() {
		/*
		String ham = sandProp.getProperty("ham");
		sandProp.getProperty("egg");
		sandProp.getProperty("cheese");
		*/
		Set<Object> keys = sandProp.keySet();
		for (Object key : keys) {
			String sand = (String)sandProp.get(key);
			System.out.println(sand);
		}
	}
	
	private Map<String, Sand> sandMap;
	public void setSandMap(Map<String, Sand> sandMap) {
		System.out.println("setSandMap 호출됨");
		this.sandMap = sandMap;
	}
	public void printMap() {
		Set<String> keys = sandMap.keySet();
		for (String key : keys) {
			Sand sand = sandMap.get(key);
			sand.info();
		}
	}
	
	private Set<Sand> sandSet;
	public void setSandSet(Set<Sand> sandSet) {
		System.out.println("setSandSet 호출됨 : " + sandSet.size());
		this.sandSet = sandSet;
	}
	public void printSet() {
		for (Sand sand : sandSet) {
			sand.info();
		}
	}

	private List<Sand> sandList;
	public void setSandList(List<Sand> sandList) {
		System.out.println("setSandList 호출됨 : " + sandList.size());
		this.sandList = sandList;
	}
	public void printList() {
		for (Sand sand : sandList) {
			sand.info();
		}
	}
	
}











