package com.milenian.basic.hitung;

import com.milenian.basic.bidang.Lingkaran;

public class HitungLingkaran {
	public static double luas(Lingkaran lingkaran) {
		return 3.14 * lingkaran.getRadius() * lingkaran.getRadius();
	}
	
	public static double keliling(Lingkaran lingkaran) {
		return 2 * 3.14 * lingkaran.getRadius();
	}

}
