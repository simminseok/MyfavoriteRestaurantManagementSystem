package restaurant;

import java.util.Scanner;

public class Chinesefood extends FusionRestaurant {
	
	public Chinesefood(RestaurantKind kind) {
		super(kind);
	}
	
	protected String ownerphone; 
	
	public void getUserInput(Scanner input) {
		setRestaurantfavoriteranking(input);
		setRestaurantName(input);
		setRestaurantAddress(input);
		setRestaurantPhonewithYN(input);
		setOwnerPhonewithYN(input);
	}
	
	public void setOwnerPhonewithYN(Scanner input) {
		char answer = 'x';
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
		String skind = getKindString();
		System.out.println("kind: " + skind + " favoliteranking: " + favoriteranking + " name: " + name + " address:" + address + " phone:" + phone + " owner's phone:" + ownerphone);      
	}
}