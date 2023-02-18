package com.milenian.basic;

import com.milenian.basic.bidang.Lingkaran;
import com.milenian.basic.hitung.HitungLingkaran;

public class ArrayLingkaran {
	public static void main(String[] args) {
		Lingkaran[] arrayLingkaran = new Lingkaran[] {
				new Lingkaran(50),
				new Lingkaran(140),
				new Lingkaran(4.20)
		};
		
		for (Lingkaran l: arrayLingkaran) {
			double luas = HitungLingkaran.luas(l);
			double keliling = HitungLingkaran.keliling(l);
			System.out.printf("Lingkaran -> Radius : %.2f | "
					+ "Luas : %.2f | "
					+ "Keliling : %.2f%n", l.getRadius(), luas, keliling);
		}
	}

}
