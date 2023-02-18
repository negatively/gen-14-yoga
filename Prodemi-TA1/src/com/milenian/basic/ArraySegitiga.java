package com.milenian.basic;

import com.milenian.basic.hitung.HitungSegitiga;
import com.milenian.basic.bidang.Segitiga;

public class ArraySegitiga {
	public static void main(String[] args) {
		Segitiga[] arraySegitiga = new Segitiga[] {
				new Segitiga(12,6),
				new Segitiga(400, 82.8),
				new Segitiga(70.70, 100.80)
		};
		
		for(Segitiga s: arraySegitiga) {
			double luas = HitungSegitiga.luas(s);
			double keliling = HitungSegitiga.keliling(s);
			System.out.printf("Segitiga -> Alas, Tinggi : %.2fcm, %.2fcm | "
					+ "Luas : %.2fcm2 | "
					+ "Keliling : %.2fcm%n",
					s.getAlas(),s.getTinggi(),luas,keliling);
		}
	}

}
