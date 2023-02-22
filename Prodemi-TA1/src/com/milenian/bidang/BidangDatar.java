package com.milenian.bidang;

public abstract class BidangDatar {
	private double luasBidang;
	private double kelilingBidang;
	
	public abstract String getLuas();
	
	public abstract String getKeliling();

	public double getLuasBidang() {
		return luasBidang;
	}

	public void setLuasBidang(double luasBidang) {
		this.luasBidang = luasBidang;
	}

	public double getKelilingBidang() {
		return kelilingBidang;
	}

	public void setKelilingBidang(double kelilingBidang) {
		this.kelilingBidang = kelilingBidang;
	}


}
