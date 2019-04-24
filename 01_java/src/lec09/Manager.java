package lec09;

public class Manager extends Employee {	// -> Manager 는 Employee를 상속했다.
	// 관리하는 사원의 목록
	private Employee[] mngEmpList;

	public Manager() {}
	
	/*	
	// 상속받은 Employee 클래스에 존재하는 것을 활용하자.
	private String name;
	private int empNo;
	*/
	public Manager(String name, int empNo, Employee[] mngEmpList) {
//		this.mngEmpList = mngEmpList;	// Employee 클래스에 있는 변수를 protected 를 통해 this.으로 가져와서 쓸수있다.
		
		super(name, empNo); // 부모 클래스의 () 값들을 가져온다..
		/*
		this.name = name;
		this.empNo = empNo;
		*/
		this.mngEmpList = mngEmpList;
	}
	
	public Employee[] getMngEmpList() {
		return mngEmpList;
	}

	public void setMngEmpList(Employee[] mngEmpList) {
		this.mngEmpList = mngEmpList;
	}
	
	
	
	
	
	public String info() {	// Employee 클래스에 이미 info가 있지만 반환타입,매개변수,메서드이름을 동일하게 해서(오버라이딩) 새로 내용을 만들었다.
		/*
		System.out.println(mngEmpList);
		// 상속받은 변수 또는 메서드를 사용하려면 접근제한자가 허용되어야 한다.  -> private는 접근을 제한하니까 불러올 수 없다..
		System.out.println(getName());
		System.out.println(getEmpNo());	
		*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("name = " + name + ", empNo = " + empNo + "\n");
		sb.append("관리하는 사원의 정보\n");
		sb.append("-------------------------\n");
		for (Employee e : mngEmpList){
			sb.append(e.info() + "\n");
		}
		sb.append("-------------------------\n");
		return sb.toString();  // -> StringBuilder 안의 내용을 문자열로 바꿔줘 : sb.toString();
		
		/*	
		name : King, empNo : 100
		관리하는 사원의 정보
		---------------------------
		name : 벤, empNo : 1
		name : 마이클, empNo : 2
		---------------------------
		 */
	}
	 
}

