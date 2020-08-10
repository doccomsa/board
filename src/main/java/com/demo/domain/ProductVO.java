package com.demo.domain;

public class ProductVO {
	
	private int pCode;
	private String pName;
	private double pPrice;
	
	public int getpCode() {
		return pCode;
	}
	
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	public ProductVO(int pCode, String pName, double pPrice) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "ProductVO [pCode=" + pCode + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
}
