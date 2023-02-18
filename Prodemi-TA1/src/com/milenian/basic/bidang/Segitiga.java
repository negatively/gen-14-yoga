package com.milenian.basic.bidang;

public class Segitiga {
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
	
	
}
