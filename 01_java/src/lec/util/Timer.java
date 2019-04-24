package lec.util;

public class Timer {
	private long start;
	
	public void start() {
		start = System.currentTimeMillis();
	}
	
	public double end() {
		return (System.currentTimeMillis() - start) / 1000d;
	}

	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();
		// ...
		System.out.println(t.end());
	}
}
