package lec05;

public class Test02 {
	public static void main(String[] args) {
		Book a = new Book();
		Book b = a;
		Book c = new Book();
		
		a.name = "자바";
		a.price = 11000;
		a.writer = "고슬링";
		
		c.name = "c++";
		c.price = 22000;
		c.writer = "씨삽";
		
		System.out.println(b.name);
		
		b.price = 50000;
		System.out.println(a.price);
		System.out.println(b.price);
	}
}















