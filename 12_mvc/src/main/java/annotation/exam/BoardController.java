package annotation.exam;

public class BoardController {
	@RequestMapping(value="/board/list.do")
	public void list() {
		System.out.println("목록 조회용");
	}
	
	@RequestMapping("/board/writeform.do")
	public void writeForm() {
		System.out.println("글쓰기 폼용");
	}
	
	@RequestMapping("/board/write.do")
	public void write() {
		System.out.println("글등록용");
	}
}


