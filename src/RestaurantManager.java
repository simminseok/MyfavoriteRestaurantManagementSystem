import java.util.ArrayList;
import java.util.Scanner;

import restaurant.Chinesefood;
import restaurant.Japanesefood;
import restaurant.Koreanfood;
import restaurant.Restaurant;
import restaurant.RestaurantInput;
import restaurant.RestaurantKind;
import restaurant.Westernfood;

public class RestaurantManager {
	ArrayList<RestaurantInput> restaurants = new ArrayList<RestaurantInput>();
	Scanner input;

	RestaurantManager(Scanner input){
		this.input = input;
	}
	public void addrestaurant() {
		int kind = 0;
		RestaurantInput restaurantInput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1 for Koreanfood ");
			System.out.println("2 for Japanesefood ");
			System.out.println("3 for Chinesefood ");
			System.out.println("4 for Westernfood ");
			System.out.println("Select num for Restaurant Kind (between 1 to 4) : ");
			kind = input.nextInt();
			if(kind == 1) {
				restaurantInput = new Koreanfood(RestaurantKind.Koreanfood);
				restaurantInput.getUserInput(input);
				restaurants.add(restaurantInput);
				break;
			}
			else if(kind == 2) {
				restaurantInput = new Japanesefood(RestaurantKind.Japanesefood);
				restaurantInput.getUserInput(input);
				restaurants.add(restaurantInput);
				break;
			}
			else if(kind == 3) {
				restaurantInput = new Chinesefood(RestaurantKind.Chinesefood);
				restaurantInput.getUserInput(input);
				restaurants.add(restaurantInput);
				break; 
			}
			else if(kind == 4) {
				restaurantInput = new Westernfood(RestaurantKind.Westernfood);
				restaurantInput.getUserInput(input);
				restaurants.add(restaurantInput);
				break;
			}
			else {
			}
		}   
	}

	public void deleterestaurant() {
		System.out.print("Restaurant Name: ");
		String name = input.next();
		int index = -1;
		for(int i = 0 ; i<restaurants.size(); i++) {
			if((restaurants.get(i).getName()).equals(name)) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			restaurants.remove(index);
			System.out.println("the Restaurant " + name + " is deleted");
		}
		else {
			System.out.println("the Restaurant has not been registered");
		}
	}

	public void editrestaurant() {
		System.out.print("Restaurant name:");
		String restaurantname = input.next();
		for(int i = 0; i<restaurants.size(); i++) {
			RestaurantInput restaurantInput = restaurants.get(i);
			if((restaurantInput.getName()).equals(restaurantname)) {
				int num = -1;
				while(num != 5) {
					System.out.println("** Restaurant Info Edit Menu **");
					System.out.println("1. Edit favoliteranking");
					System.out.println("2. Edit name");
					System.out.println("3. Edit address");
					System.out.println("4. Edit phonenumber");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5:");
					num = input.nextInt();
					if(num == 1) {
						System.out.println("Restaurant favoliteranking : ");
						int favoliteranking = input.nextInt();
						restaurantInput.setFavoliteranking(favoliteranking);
					}
					else if(num == 2) {
						System.out.println("Restaurant name : ");
						String name = input.next();
						restaurantInput.setName(name);
					}
					else if(num == 3) {
						System.out.println("Restaurant address : ");
						String address = input.next();
						restaurantInput.setAddress(address);
					}
					else if(num == 4) {
						System.out.println("Restaurant phone : ");
						String phone = input.next();
						restaurantInput.setPhone(phone);
					}
					else{
						continue;
					}
				}
			}
		}
	}

	public void viewrestaurant() {
		for(int i = 0; i < restaurants.size(); i ++) {
			restaurants.get(i).printInfo();
		}
	}
}