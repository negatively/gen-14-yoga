package com.milenian.basic.hitung;

import com.milenian.basic.bidang.Segitiga;

public class HitungSegitiga {
	public static double luas(Segitiga segitiga) {
		return 0.5 * segitiga.getAlas() * segitiga.getTinggi();
	}
	
	public static double keliling(Segitiga segitiga) {
		return  segitiga.getAlas() + 2 * segitiga.getSisi();
	}

}
