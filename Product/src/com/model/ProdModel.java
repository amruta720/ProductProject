package com.model;

public class ProdModel {
    private int prdno;
    private String ProdName;
    private String Price;
    private int qua;
    public ProdModel(){
    	}
	public int getPrdno() {
		return prdno;
	}
	public void setPrdno(int prdno) {
		this.prdno = prdno;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
    

}
