package com.milenian.bidang;


public class Persegi extends BidangDatar{
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
	public String getLuas() {
		this.setLuasBidang(this.sisi * this.sisi);
		return String.format("Luas Persegi : %.2f",getLuasBidang());
	}
	
	@Override
	public String getKeliling() {
		this.setKelilingBidang(4 * this.sisi);
		return String.format("Keliling Persegi : %.2f", this.getKelilingBidang());
	}

	
}
