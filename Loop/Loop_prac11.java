package kr.ac.kopo.day02;

/*
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

public class Loop_prac11 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * (n - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
