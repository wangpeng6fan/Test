package com.first.entity;

public class Product {
/*
 * 2018.03.27
 * 不带参数的构造方法
 * 对象的私有属性，例如：id，name等等；
 * 对象的get方法；
 * 对象的set方法
 */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer id;
	private String name;
	private Integer price;
	private String description;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
