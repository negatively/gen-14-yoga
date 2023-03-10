package com.milenian.bidang;

/**
 * @author Yoga Mileniandi
 * 
 */
public class BelahKetupat extends BidangDatar {
	private double diagonal1;
	private double diagonal2;

	public BelahKetupat(double diagonal1, double diagonal2) {
		super();
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	
	public double getDiagonal1() {
		return diagonal1;
	}
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	public double getSisi() {
		return Math.sqrt( Math.pow(0.5 *diagonal1, 2) + Math.pow( 0.5 * diagonal2,2));
	}
	@Override
	public String toString() {
		return "BelahKetupat [diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 +  "]";
	}
	
	@Override
	public String getLuas() {
		this.setLuasBidang(0.5 * this.diagonal1 * this.diagonal2);
		return String.format("Luas Belah Ketupat : %.2f",getLuasBidang());
	}
	@Override
	public String getKeliling() {
		this.setKelilingBidang( 4 * this.getSisi());
		return String.format("Keliling Belah Ketupat : %.2f", this.getKelilingBidang());		
	}
}
