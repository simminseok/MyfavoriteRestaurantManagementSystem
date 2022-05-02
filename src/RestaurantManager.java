import java.util.ArrayList;
import java.util.Scanner;

import restaurant.Chinesefood;
import restaurant.Japanesefood;
import restaurant.Koreanfood;
import restaurant.Restaurant;
import restaurant.RestaurantKind;
import restaurant.Westernfood;

public class RestaurantManager {
	ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	Scanner input;

	RestaurantManager(Scanner input){
		this.input = input;
	}
	public void addrestaurant() {
		int kind = 0;
		Restaurant restaurant;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1 for Koreanfood ");
			System.out.println("2 for Japanesefood ");
			System.out.println("3 for Chinesefood ");
			System.out.println("4 for Westernfood ");
			System.out.println("Select num for Restaurant Kind (between 1 to 4) : ");
			kind = input.nextInt();
			if(kind == 1) {
				restaurant = new Restaurant(RestaurantKind.Koreanfood);
				restaurant.getUserInput(input);
				restaurants.add(restaurant);
				break;
			}
			else if(kind == 2) {
				restaurant = new Japanesefood(RestaurantKind.Japanesefood);
				restaurant.getUserInput(input);
				restaurants.add(restaurant);
				break;
			}
			else if(kind == 3) {
				restaurant = new Chinesefood(RestaurantKind.Chinesefood);
				restaurant.getUserInput(input);
				restaurants.add(restaurant);
				break;
			}
			else if(kind == 4) {
				restaurant = new Westernfood(RestaurantKind.Westernfood);
				restaurant.getUserInput(input);
				restaurants.add(restaurant);
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
			Restaurant restaurant = restaurants.get(i);
			if((restaurant.getName()).equals(restaurantname)) {
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
						restaurant.setFavoliteranking(favoliteranking);
					}
					else if(num == 2) {
						System.out.println("Restaurant name : ");
						String name = input.next();
						restaurant.setName(name);
					}
					else if(num == 3) {
						System.out.println("Restaurant address : ");
						String address = input.next();
						restaurant.setAddress(address);
					}
					else if(num == 4) {
						System.out.println("Restaurant phone : ");
						String phone = input.next();
						restaurant.setPhone(phone);
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