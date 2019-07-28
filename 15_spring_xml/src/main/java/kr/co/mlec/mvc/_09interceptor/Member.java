package kr.co.mlec.mvc._09interceptor;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Member {
	private String id;
	private String password;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}











