package lec15;

public class Data implements Comparable<Data>{
	
	
	
	@Override   // Comparable 을 상속했기 때문에 오버라이딩 해줘야 함.
	public int compareTo(Data o) {
//		return this.num - o.getNum() ;
		return this.name.compareTo(o.getName());
	}
	
	
	private int num;
	private String name;
	
	public Data () {}
	public Data (int num) {
		this.num = num;
	}
	public Data (String name, int num ) {
		this.name = name;
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("Data[name=%s, num=%d]", name, num);
	}
	
}
