package kr.ca.kopo.day05.extend02.copy;

public class Employee {
	
	/** 사원번호 */  // "//* ~ */" -> 문서화 주석
	int no;
	/** 사원이름 */
	String name;
	String grade;
	int salary;
	
	public Employee() {
		
	}
	
	Employee(int no, String name, String grade, int salary) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	/*
	 
	 */
	/**
	 	Employee 객체의 모든 정보를 출력하는 메서드
	 */
	
	void showInfo() {
		System.out.println("번호 : " + no + ", 이름 : " + name + ", 직급 : " + grade + ", 연봉 : " + salary + "만원");
	}

}
