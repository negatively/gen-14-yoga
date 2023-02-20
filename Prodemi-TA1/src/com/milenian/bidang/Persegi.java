package com.milenian.bidang;

import com.milenian.hitung.*;

public class Persegi extends HitungBidang{
	private double sisi;
	
	public Persegi(double sisi) {
		super();
		this.sisi = sisi;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	
	@Override
	public String toString() {
		return "Sisi : " + this.sisi;
	}
	
	@Override
	public String luas() {
		luasBidang = this.sisi * this.sisi;
		return String.format("Luas Persegi : %.2f",luasBidang);
	}
	
	@Override
	public String keliling() {
		kelilingBidang = 4 * this.sisi;
		return String.format("Keliling Persegi : %.2f", kelilingBidang);
	}

	
}
