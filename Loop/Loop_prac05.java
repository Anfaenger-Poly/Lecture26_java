package kr.ac.kopo.day02;

/*
 * 56789
 * 45678
 * 34567
 * 23456
 * 12345
 */

public class Loop_prac05 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j < 10 ; j++) {
				System.out.print(j-i);
			}
			System.out.println(" ");
		}
		

	}

}
