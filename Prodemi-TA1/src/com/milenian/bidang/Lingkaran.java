package com.milenian.bidang;

import com.milenian.hitung.*;

public class Lingkaran extends HitungBidang{
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
	public String luas() {
		luasBidang = 3.14 * this.radius * this.radius;
		return String.format("Luas Lingkaran : %.2f",luasBidang);
	}
	
	@Override
	public String keliling() {
		kelilingBidang = 2 * 3.14 * this.radius;
		return String.format("Keliling Lingkaran : %.2f", kelilingBidang);
	}
}
