package restaurant;

import java.util.Scanner;

public class Restaurant {
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
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Koreanfood:
			skind = "Koreanfood";
		    break;
		case Japanesefood:
			skind = "Japanesefood";
			break;
		case Chinesefood:
			skind = "Chinesefood";
			break;
		case Westernfood:
			skind = "Westernfood";
			break;
		default:
		}
		System.out.println("kind: " + skind + " favoliteranking: " + favoliteranking + " name: " + name + " address:" + address + " phone:" + phone);      
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