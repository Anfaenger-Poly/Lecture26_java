package kr.ca.kopo.day05.extend02.copy;

public class Manager extends Employee {
	
	int no;
	String name;
	String grade;
	int salary;
	/** 관리사원 목록 */
	Employee[] empList;
	public Manager() {
		
	}
	
	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary); // 부모의 생성자 호출. 값 초기화
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	
	@Override // Annotation
	void showInfo() {
		super.showInfo();
//		System.out.println("번호 : " + no + ", 이름 : " + name + ", 직급 : " + grade + ", 연봉 : " + salary + "만원");
		System.out.println("< 관리 사원 목록 >");
		for(int i = 0; i < empList.length; i ++) {
			empList[i].showInfo();
		}
	}

}
