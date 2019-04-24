package exam;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random r = new Random();
		int ran = r.nextInt(4)+1;
		Shape s;
		switch (ran) {
		case 1:
			s = new Rectangle();
			s.area();
			break;
		case 4:
			s = new Circle();
			s.area();
			break;
			
			
		case 2:
			s = new Square();
			s.area();
			break;
			
		case 3:
			s = new Triangle();
			s.area();
			break;
			
		}
	}
}


abstract class Shape {
	Random r = new Random();
	int x = r.nextInt(10)+1;
	public abstract void area();
}

class Rectangle extends Shape{
	int y = r.nextInt(10)+1;
	public void area() {
		System.out.println("직사각형의 면적은 " + (x*y) + "입니다.");
	}
}

class Triangle extends Shape{
	int y = r.nextInt(10)+1;
	public void area() {
		System.out.println("삼각형의 면적은 " + (x*y/2) + "입니다.");
	}
}

class Circle extends Shape{
	static final double PI = 3.141592;
	public void area() {
		System.out.println("원의 면적은 " + (x*x)*PI + "입니다.");
	}
}

class Square extends Rectangle {
	public void area() {
		System.out.println("정사각형의 면적은 " + (x*x) + "입니다.");
	}
}