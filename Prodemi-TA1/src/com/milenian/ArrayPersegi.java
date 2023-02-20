package com.milenian.basic;

import com.milenian.basic.bidang.Persegi;
import com.milenian.basic.hitung.HitungPersegi;

public class ArrayPersegi {
	public static void main(String[] args) {
		Persegi[] arrayPersegi = new Persegi[] {
				new Persegi(20),
				new Persegi(25.4),
				new Persegi(33.33),
				new Persegi(12.12),
				new Persegi(100)
		};
		
		for (Persegi p: arrayPersegi) {
			double luas = HitungPersegi.luas(p);
			double keliling = HitungPersegi.keliling(p);
			System.out.printf("Persegi -> Sisi: %.2fcm | "
					+ "Luas : %.2fcm2 | "
					+ "Keliling : %.2fcm%n", p.getSisi(), luas, keliling);
		}
		
	}

}
