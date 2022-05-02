package restaurant;

import java.util.Scanner;

public class ChinesefoodRestaurant extends Restaurant {
	public void getUserInput(Scanner input) {
		System.out.print("Favoliteranking: ");
		int favoliteranking = input.nextInt();
		this.setFavoliteranking(favoliteranking);

		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' & answer != 'N') {
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Restaurant address: ");
				String address = input.next();
				this.setAddress(address);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setAddress("");
				break;
			}
			else {
			}
		}

		System.out.print("Restaurant phone: ");
		String phone = input.next();  
		this.setPhone(phone);
	}

}
