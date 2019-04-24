/**
 * 	객체를 저장 하고 읽기

 * 
 * 	조건 : 직렬화 대상 클래스는 Serializable 인터페이스를 상속해야 한다.
 * 
 * 	직렬화 대상에서 필드를 제외하고 싶다면 transient 키워드(예약어)를 붙여서 선언
 * 
 */
package lec17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable{
	private static final long serialVersionUID = 5820514550433012287L;



	String name;
	String id;
	// 직렬화 대상에서 제외하자..
	transient String password;
	
	
	
	public Member() { 	// Alt + shift + s + c
		super();
	}
	public Member(String name, String id, String password) {  // Alt + shift + s + o
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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

}

public class Test17 {
	private static void writeFile () throws Exception {
		Member m = new Member("만수르", "42", "7777");
		FileOutputStream fos = new FileOutputStream("data/lec17/member.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(m);
		oos.close();
		fos.close();
		System.out.println("객체 정보 저장 완료.");
	}
	
	private static void readFile() throws Exception{
		FileInputStream fis = new FileInputStream("data/lec17/member.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Member m = (Member)ois.readObject();
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getPassword());
		
		ois.close();
		fis.close();
	}
	
	public static void main(String[] args) {
		try {
//			writeFile();
			readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}
}
