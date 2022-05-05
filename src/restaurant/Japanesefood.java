package restaurant;

import java.util.Scanner;

public class Japanesefood extends Restaurant implements RestaurantInput {

	public Japanesefood(RestaurantKind kind) {
		super(kind);
	}

	protected String ownerphone; 

	public void getUserInput(Scanner input) {
		System.out.print("Favoliteranking: ");
		int favoliteranking = input.nextInt();
		this.setFavoliteranking(favoliteranking);

		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);

		System.out.print("Restaurant Address: ");
		String address = input.next();  
		this.setAddress(address);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' & answer != 'N') {
			System.out.print("Do you have a Restaurant phone number? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Phone number: ");
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}

		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' & answer != 'N') {
			System.out.print("Do you have a owner's phone number? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("owner's phone number: ");
				ownerphone = input.next();
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				ownerphone = " ";
				break;
			}
			else {
			}
		}
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
		System.out.println("kind: " + skind + " favoliteranking: " + favoliteranking + " name: " + name + " address:" + address + " phone:" + phone + " owner's phone:" + ownerphone);      
	}
}