package restaurant;

import java.io.Serializable;
import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class Restaurant implements RestaurantInput, Serializable {
	private static final long serialVersionUID = -2566694571874785380L;
	
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

	public void setPhone(String phone) throws PhoneFormatException {
		if(!phone.contains("-") && !phone.equals("")) {
			throw new PhoneFormatException();
		}
		this.phone = phone;
	}

	public abstract void printInfo();

	public void setRestaurantfavoliteranking(Scanner input) {
		System.out.print("Restaurant favoliteranking : ");
		int favoliteranking = input.nextInt();
		this.setFavoliteranking(favoliteranking);
	}

	public void setRestaurantName(Scanner input) {
		System.out.print("Restaurant name : ");
		String name = input.next();
		this.setName(name);
	}

	public void setRestaurantAddress(Scanner input) {
		System.out.print("Restaurant address : ");
		String address = input.next();
		this.setAddress(address);
	}

	public void setRestaurantPhone(Scanner input) {
		String phone = "";
		while (!phone.contains("-")) {
			System.out.print("Restaurant phone : ");
			phone = input.next();
			try {
				this.setPhone(phone);
			} 
			catch (PhoneFormatException e) {
				System.out.println("Incorrect Phone Format. put the phone number that containts -");
			}
		}
	}

	public String getKindString() {
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
		return skind;
	}
}