package restaurant;

import java.util.Scanner;

public abstract class Restaurant {
	protected RestaurantKind kind = RestaurantKind.Koreanfood;
	protected int favoliteranking;
	protected String name;
	protected String address;
	protected String phone;

	public Restaurant() {    
	}
	
	public Restaurant(RestaurantKind kind) {
		this.kind = kind;
	}

	public Restaurant(int favoliteranking, String name, String address, String phone) {
		this.favoliteranking = favoliteranking;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Restaurant(RestaurantKind kind, int favoliteranking, String name, String address, String phone) {
		this.kind = kind;
		this.favoliteranking = favoliteranking;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public RestaurantKind getKind() {
		return kind;
	}
	
	public void setKind(RestaurantKind kind) {
		this.kind = kind;
	}
	
	public int getFavoliteranking() {
		return favoliteranking;
	}
	
	public void setFavoliteranking(int favoliteranking) {
		this.favoliteranking = favoliteranking;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public abstract void printInfo();
	
}