package lec09;

public class Employee {
//	private String name;
//	private int empNo;
	// 상속받은 클래스는 어느 위치(패키지)에서나 사용이 가능하다.  : protected
	protected String name;
	protected  int empNo;
	
	public Employee() {
	}   // -> 생성자 생성
	public Employee(String name, int empNo) {
		this.name = name;
		this.empNo = empNo;
		
	} 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	public String info(){
//		return "name=" + name + ", empNo=" + empNo;
		return String.format("name = %s , empNo = %d", name,empNo);
	}
	
	
}
