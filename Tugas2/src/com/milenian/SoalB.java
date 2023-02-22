package com.milenian;

/**
 * @author Yoga Mileniandi
 *
 */
public class SoalB {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 9;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i + j == n - 1) || (i - j == 0)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}				
			}
			System.out.println();
		}

	}

}
