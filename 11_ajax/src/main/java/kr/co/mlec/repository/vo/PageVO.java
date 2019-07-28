package kr.co.mlec.repository.vo;

public class PageVO {
	private int pageNo = 1;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getBegin() {
		return (this.pageNo -1) * 10 + 1;
	}
	public int getEnd() {
		return this.pageNo * 10;
	}
}








