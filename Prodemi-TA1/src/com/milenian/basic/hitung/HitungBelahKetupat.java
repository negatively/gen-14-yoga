package com.milenian.basic.hitung;

import com.milenian.basic.bidang.BelahKetupat;

public class HitungBelahKetupat {
	public static double luas(BelahKetupat belahKetupat) {
		return 0.5 * belahKetupat.getDiagonal1() * belahKetupat.getDiagonal2();
		
	}
	
	public static double keliling(BelahKetupat belahKetupat) {
		return 4 * belahKetupat.getSisi();
	}

}
