package lec06;

public class TV {
	int volume = 20;
	int channel = 7;
	
	public void On() {
		System.out.println("티비 전원을 켭니다.");
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int setChannel(int i) {
		channel = i;
		return i;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void volumeUp() {
		volume++;
	}
	
	public void mute() {
		volume = 0;
	}
	
	public void Off() {
		System.out.println("티비 전원을 끕니다.!!!!");
	}
	
}
