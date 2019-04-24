package lec05;

public class Test03 {
	public static void main(String[] args) {
		Bread[] arr = new Bread[3];
		Bread b = new Bread();
		b.name = "소보로";
		b.price = 1000;
		b.cal = 220;
		arr[0] = b;
		
		arr[1] = new Bread();
		arr[1].name = "단팥빵";
		arr[1].price = 2000;
		arr[1].cal = 300;
		
		for (int i = 0; i < arr.length; i++) {
			Bread bread = arr[i];
			if (bread == null) {
				break;
			}
			System.out.println("-------------");
			System.out.println("이름 : " + bread.name);
			System.out.println("가격 : " + bread.price);
			System.out.println("설명 : " + bread.content);
			System.out.println("칼로리 : " + bread.cal);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


















