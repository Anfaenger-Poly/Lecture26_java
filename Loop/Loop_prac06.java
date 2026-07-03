package kr.ac.kopo.day02;

/*
 * *
 * **
 * ***
 * ****
 * *****
 */

public class Loop_prac06 {

	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			int cnt = i;
			while(cnt < 6) {
				System.out.print("*");
				cnt++;
			}
			System.out.println(" ");
		}
		

	}

}
