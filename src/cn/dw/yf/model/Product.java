package cn.dw.yf.model;

import java.util.Date;

public class Product {
	
private Integer id;
private String name;
private double price;
private String remark;
private Date date;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}



}
