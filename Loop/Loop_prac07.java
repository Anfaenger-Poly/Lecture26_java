package kr.ac.kopo.day02;

/*
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */

public class Loop_prac07 {

	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			int cnt = i;
			while(cnt < 6) {
				System.out.print("*");
				cnt++;
			}
			System.out.println(" ");
		}
		

	}

}

