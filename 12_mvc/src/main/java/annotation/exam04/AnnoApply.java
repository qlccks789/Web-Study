package annotation.exam04;

@ClassAnno
@RunAnno1("런타임 설정입니다.")
public class AnnoApply {
	
	@RunAnno2(id="hong", msg="점심은 먹었는가?")
	public void info() {}
	
	public void call() {}
}