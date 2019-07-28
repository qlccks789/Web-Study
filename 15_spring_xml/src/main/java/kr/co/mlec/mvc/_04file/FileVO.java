package kr.co.mlec.mvc._04file;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FileVO {
	private String msg;
	private List<MultipartFile> attach1;
	private MultipartFile[] attach2;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<MultipartFile> getAttach1() {
		return attach1;
	}
	public void setAttach1(List<MultipartFile> attach1) {
		this.attach1 = attach1;
	}
	public MultipartFile[] getAttach2() {
		return attach2;
	}
	public void setAttach2(MultipartFile[] attach2) {
		this.attach2 = attach2;
	}
}
















