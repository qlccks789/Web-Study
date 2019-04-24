package lec14;

interface Drink {}
class Coke implements Drink{}
class Sprite implements Drink{}
class IceBox<T extends Drink> {}  // Drink 를 포함한 Drink 의 자식들을 다 담을 수 있다.

public class Test05 {
	public static void main(String[] args) {
		IceBox<Drink> ice1 = new IceBox<>();
		IceBox<Coke> ice2 = new IceBox<>();
		IceBox<Sprite> ice3 = new IceBox<>();
//		IceBox<String> ice4 = new IceBox<>();   // String은 에러.. 상속관계가 아니기 때문..
		
	}
}
