package com.milenian.bidang;

public class Lingkaran extends BidangDatar{
	private double radius;
	
	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Lingkaran [radius=" + radius + "]";
	}
	
	@Override
	public String getLuas() {
		this.setLuasBidang(3.14 * this.radius * this.radius);
		return String.format("Luas Lingkaran : %.2f",this.getLuasBidang());
	}
	
	@Override
	public String getKeliling() {
		this.setKelilingBidang(2 * 3.14 * this.radius);
		return String.format("Keliling Lingkaran : %.2f", this.getKelilingBidang());
	}
}
