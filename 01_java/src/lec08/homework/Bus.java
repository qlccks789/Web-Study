package lec08.homework;

public class Bus {
	private int busNo;
	private int passenger;
	private static int busAll;
	
	Bus(int busNo){
		this.busNo = busNo;
		System.out.println(busNo + "번 버스 운행 시작.");
	}
	
	public void ride() {
		ride(1);
	}
	
	public void ride(int num) {
		System.out.printf("승객 %d명 승차%n", num);
		passenger += num;
		busAll += num;
		
	}
	
	public void leave() {
		leave(1);
	}
	
	public void leave(int num) {
		System.out.printf("승객 %d명 하차%n", num);
		passenger -= num;
	}
	
	public String toString() {
		System.out.printf("%d번 버스의 현재 승차인원 : %d명%n", busNo,passenger);
		System.out.printf("모든 버스의 누적 승차인원 : %d명", busAll);
		return "";
	}
	
}