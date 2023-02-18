package com.milenian.basic.bidang;

public class Lingkaran {
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
}
