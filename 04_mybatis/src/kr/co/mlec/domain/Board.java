package kr.co.mlec.domain;

import java.util.Date;
import java.util.List;

public class Board {
	private int no;
	private String writer;
	private String title;
	private String content;
	private Date regDate;
	private List<Comment> commentList;
	
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriter() {
		return writer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
