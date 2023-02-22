package com.milenian.bidang;

public class Segitiga extends BidangDatar{
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
	public String getLuas() {
		this.setLuasBidang( 0.5 * this.alas * this.tinggi);
		return String.format("Luas Segitiga : %.2f",this.getLuasBidang());
	}
	
	@Override
	public String getKeliling() {
		this.setKelilingBidang(this.alas + 2 * this.getSisi());
		return String.format("Keliling Segitiga : %.2f", this.getKelilingBidang());
	}
	
	
}
