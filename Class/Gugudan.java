package kr.ac.kopo.day04;

import java.util.Scanner;

public class Gugudan {
	
	// 키보드로 2-0사이의 단을 입력받아 넘겨주는 기능의 메소드
	int inputDan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		return dan;
		
	}
	
//		2~9단 까지의 구구단을 출력하는 메서드
/*	void printGu() {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		System.out.println();
	}
*/	
	
/*	2~9단 까지의 구구단을 출력하는 메소드
	void print() { // 매개변수 없으면 전체, 있으면 해당하는 단만 출력 -> 메서드 오버로딩
		for(int dan = 2; dan <= 9; dan++) {
			print(dan); // this. 생략 가능
		}
	}
*/
	// 2~9단 까지의 구구단을 출력하는 메서드
	void print() {
		print(2, 9);
	}
	
	
	// 매개변수에 날라오는 단의 해당하는 구구단을 출력하는 메서드
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	// 시작단에서부터 종료단까지 구구단을 출력하는 메서드
	void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}
	
}
