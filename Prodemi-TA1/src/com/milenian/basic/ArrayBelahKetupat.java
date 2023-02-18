package com.milenian.basic;

import com.milenian.basic.bidang.BelahKetupat;
import com.milenian.basic.hitung.HitungBelahKetupat;

public class ArrayBelahKetupat {
	public static void main(String[] args) {
		BelahKetupat[] arrayBelKet = new BelahKetupat[] {
				new BelahKetupat(12,10),
				new BelahKetupat(16.8, 40.4),
				new BelahKetupat(88.88, 60),
		};
		
		for(BelahKetupat bk: arrayBelKet) {
			double luas = HitungBelahKetupat.luas(bk);
			double keliling = HitungBelahKetupat.keliling(bk);
			System.out.printf("Belah Ketupat -> D1, D2 : %.2f, %.2f | "
					+ "Luas : %.2f | "
					+ "Keliling %.2f%n", 
					bk.getDiagonal1(),bk.getDiagonal2(),luas,keliling);
		}
	}

}
