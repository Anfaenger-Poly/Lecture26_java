package kr.ac.kopo.day04;

// import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
		gu.print();
		
//		System.out.print("2-9단 사이의 단을 입력 : ");
//		int dan = sc.nextInt();
		
		int dan = gu.inputDan();
		
		gu.print(dan); // 출력만 해서 return type -> void(없음)
		
		int startDan = gu.inputDan();
		int endDan = gu.inputDan();
		gu.print(startDan, endDan);

	}

}
