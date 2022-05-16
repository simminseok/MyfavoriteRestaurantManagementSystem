package restaurant;

import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class FusionRestaurant extends Restaurant {
	
	public FusionRestaurant(RestaurantKind kind) {
		super(kind);
	}

	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " favoliteranking: " + favoliteranking + " name: " + name + " address:" + address + " phone:" + phone);      
	}
	
	public void setRestaurantPhonewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' & answer != 'N') {
			System.out.print("Do you have a Restaurant phone number? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setRestaurantPhone(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setPhone("");
					break;
				}
				else {
				}
			}
			catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Format. put the phone number that containts -");
			}
		}
	}

}
