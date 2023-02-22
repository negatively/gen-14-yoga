/**
 * 
 */
package com.milenian;

/**
 * @author Yoga Mileniandi
 *
 */
public class SoalD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 9;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int oddNum = j * 2 + 1;
				if((i + j == n - 1) || (i - j == 0)) {
					System.out.print( oddNum + " ");
				} else {
					System.out.print("  ");
				}				
			}
			System.out.println();
		}

	}

}
