package com.milenian.bidang;

import com.milenian.hitung.*;

public class Segitiga extends HitungBidang{
	private double alas;
	private double tinggi;
	
	public Segitiga(double alas, double tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public double getAlas() {
		return alas;
	}
	public void setAlas(double alas) {
		this.alas = alas;
	}
	public double getTinggi() {
		return tinggi;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	
	public double getSisi() {
		return Math.sqrt(Math.pow(tinggi, 2) + Math.pow(0.5 * alas, 2));
	}

	@Override
	public String toString() {
		return "Segitiga [alas=" + alas + ", tinggi=" + tinggi + "]";
	}
	
	@Override
	public String luas() {
		luasBidang = 0.5 * this.alas * this.tinggi;
		return String.format("Luas Segitiga : %.2f",luasBidang);
	}
	
	@Override
	public String keliling() {
		kelilingBidang = this.alas + 2 * this.getSisi();
		return String.format("Keliling Segitiga : %.2f", kelilingBidang);
	}
	
	
}
