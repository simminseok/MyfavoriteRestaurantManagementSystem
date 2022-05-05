package restaurant;

import java.util.Scanner;

public class Koreanfood extends Restaurant implements RestaurantInput {
	
	public Koreanfood(RestaurantKind kind) {
		super(kind);
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
}
