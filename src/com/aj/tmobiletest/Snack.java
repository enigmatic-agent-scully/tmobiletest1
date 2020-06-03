package com.aj.tmobiletest;

public class Snack {
	private String name, code;
	private float price;
	
	public Snack() {	
	}

	public Snack(String name, String code, float price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "| " + name + " |" +"/n|  " + code + "  |" + "/n| $" + price + " |";
	}
	
	
	
}
