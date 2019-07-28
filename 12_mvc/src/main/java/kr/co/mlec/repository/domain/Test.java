package kr.co.mlec.repository.domain;

import java.util.Arrays;
import java.util.List;

public class Test {
//	public static void main(String[] args) {
//		String[] aaa = {"1", "2", "3"};
//		System.out.println(aaa);
//		
//		List<String> list = Arrays.asList(aaa);
//		System.out.println(list);
//	}
	
	
	private String id;
	private String name;
	private String[] aaa;
	private List<String> bbb;
	
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", aaa=" + Arrays.toString(aaa) + ", bbb=" + bbb + "]";
	}
	
	public String[] getAaa() {
		return aaa;
	}
	public void setAaa(String[] aaa) {
		this.aaa = aaa;
	}
	public List<String> getBbb() {
		return bbb;
	}
	public void setBbb(List<String> bbb) {
		this.bbb = bbb;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
