package com.lhd.HiMall.vo;

import java.io.Serializable;

public class OrderListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String color ;
	private String size ;
	private Integer munbers ; 
	private Double freight ;
	private String address ;
	private Double price ;
	private Integer id ;
	private String tel ;
	
	
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getMunbers() {
		return munbers;
	}
	public void setMunbers(Integer munbers) {
		this.munbers = munbers;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight) {
		this.freight = freight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderListVO [color=" + color + ", size=" + size + ", munbers=" + munbers + ", freight=" + freight
				+ ", address=" + address + ", price=" + price + ", id=" + id + ", tel=" + tel + "]";
	}
	
}