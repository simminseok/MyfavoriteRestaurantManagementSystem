package restaurant;

import java.util.Scanner;

public class Restaurant {
	protected RestaurantKind kind = RestaurantKind.KoreanfoodRestaurant;
	protected int favoliteranking;
	protected String name;
	protected String address;
	protected String phone;

	public Restaurant() {    
	}

	public Restaurant(int favoliteranking, String name, String address, String phone) {
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

	public void printInfo() {
		System.out.println("favoliteranking: " + favoliteranking + " name: " + name + " address:" + address + " phone:" + phone);      
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Favoliteranking: ");
		int favoliteranking = input.nextInt();
		this.setFavoliteranking(favoliteranking);
		
		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Restaurant address: ");
		String address = input.next();
		this.setAddress(address);
		
		System.out.print("Restaurant phone: ");
		String phone = input.next();  
		this.setPhone(phone);
	}

}