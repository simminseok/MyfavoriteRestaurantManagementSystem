package restaurant;

import java.io.Serializable;
import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class Restaurant implements RestaurantInput, Serializable {
	
	private static final long serialVersionUID = -2566694571874785380L;
	
	protected RestaurantKind kind = RestaurantKind.Koreanfood;
	protected int favoriteranking;
	protected String name;
	protected String address;
	protected String phone;

	public Restaurant() {    
	}

	public Restaurant(RestaurantKind kind) {
		this.kind = kind;
	}

	public Restaurant(int favoriteranking, String name, String address, String phone) {
		this.favoriteranking = favoriteranking;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Restaurant(RestaurantKind kind, int favoriteranking, String name, String address, String phone) {
		this.kind = kind;
		this.favoriteranking = favoriteranking;
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

	public int getFavoriteranking() {
		return favoriteranking;
	}

	public void setFavoriteranking(int favoriteranking) {
		this.favoriteranking = favoriteranking;
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

	public void setRestaurantfavoriteranking(Scanner input) {
		System.out.print("Restaurant favoriteranking : ");
		int favoriteranking = input.nextInt();
		this.setFavoriteranking(favoriteranking);
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