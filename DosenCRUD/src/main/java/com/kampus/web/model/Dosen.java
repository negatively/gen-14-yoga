package com.kampus.web.model;

public class Dosen {
	private String kodeDsn;
	private String nameDsn;
	public String getKodeDsn() {
		return kodeDsn;
	}
	public void setKodeDsn(String kodeDsn) {
		this.kodeDsn = kodeDsn;
	}
	public String getNameDsn() {
		return nameDsn;
	}
	public void setNameDsn(String nameDsn) {
		this.nameDsn = nameDsn;
	}
	@Override
	public String toString() {
		return "Dosen [kodeDsn=" + kodeDsn + ", nameDsn=" + nameDsn + "]";
	}
	
	
}
