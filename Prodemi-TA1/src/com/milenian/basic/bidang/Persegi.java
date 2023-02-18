package com.milenian.basic.bidang;

public class Persegi {
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

	
}
