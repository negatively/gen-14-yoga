package com.milenian;

import com.milenian.bidang.*;

public class Calculate {
	public static void main(String[] args) {
		BidangDatar[] daftarBidang = {
				new BelahKetupat(12,10),
				new BelahKetupat(16.8, 40.4),
				new BelahKetupat(88.88, 60),
				new Lingkaran(50),
				new Lingkaran(140),
				new Lingkaran(4.20),
				new Persegi(20),
				new Persegi(25.4),
				new Persegi(33.33),
				new Segitiga(12,6),
				new Segitiga(400, 82.8),
				new Segitiga(70.70, 100.80)
		};
		
		for(BidangDatar bd: daftarBidang) {
			System.out.println(bd.getLuas());
		}
		
	}

}
