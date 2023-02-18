package com.milenian.basic.hitung;

import com.milenian.basic.bidang.Persegi;

public class HitungPersegi {
	public static double luas(Persegi persegi) {
		return persegi.getSisi() * persegi.getSisi();
	}
	
	public static double keliling(Persegi persegi) {
		return 4 * persegi.getSisi();	
	}

}
