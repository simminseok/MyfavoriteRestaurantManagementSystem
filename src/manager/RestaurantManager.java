package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import restaurant.Chinesefood;
import restaurant.Japanesefood;
import restaurant.Koreanfood;
import restaurant.Restaurant;
import restaurant.RestaurantInput;
import restaurant.RestaurantKind;
import restaurant.Westernfood;

public class RestaurantManager implements Serializable {
	private static final long serialVersionUID = -1377272367519358879L;

	ArrayList<RestaurantInput> restaurants = new ArrayList<RestaurantInput>();
	transient Scanner input;
	
	RestaurantManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addrestaurant(int favoriteranking , String name, String address, String phone) {
		RestaurantInput restaurantInput = new Koreanfood(RestaurantKind.Koreanfood);
		restaurantInput.getUserInput(input);
		restaurants.add(restaurantInput);
	}
	
	public void addrestaurant(RestaurantInput restaurantInput) {
		restaurants.add(restaurantInput);
	}
	
	public void addrestaurant() {
		int kind = 0;
		RestaurantInput restaurantInput;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			try {
				System.out.println("1 for Koreanfood ");
				System.out.println("2 for Japanesefood ");
				System.out.println("3 for Chinesefood ");
				System.out.println("4 for Westernfood ");
				System.out.print("Select num for Restaurant Kind (between 1 to 4) : ");
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
					System.out.println("Select num for Restaurant Kind between 1~4: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}   
	}

	public void deleterestaurant() {
		System.out.print("Restaurant Name: ");
		String name = input.next();
		int index = findIndex(name);
		removefromRestaurants(index, name);
	}

	public int findIndex(String name) {
		int index = -1;
		for(int i = 0 ; i<restaurants.size(); i++) {
			if((restaurants.get(i).getName()).equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromRestaurants(int index, String name) {
		if(index >= 0) {
			restaurants.remove(index);
			System.out.println("the Restaurant " + name + " is deleted");
			return 1;
		}
		else {
			System.out.println("the Restaurant has not been registered");
			return -1;
		}
	}

	public void editrestaurant() {
		System.out.print("Restaurant name:");
		String restaurantname = input.next();
		for(int i = 0; i<restaurants.size(); i++) {
			RestaurantInput restaurant = restaurants.get(i);
			if((restaurant.getName()).equals(restaurantname)) {
				int num = -1;
				while(num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						restaurant.setRestaurantfavoriteranking(input);
						break;
					case 2:
						restaurant.setRestaurantName(input);
						break;
					case 3:
						restaurant.setRestaurantAddress(input);
						break;
					case 4:
						restaurant.setRestaurantPhone(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewrestaurant() {
		System.out.println("number of registered restaurants: " + restaurants.size());
		for(int i = 0; i < restaurants.size(); i ++) {
			restaurants.get(i).printInfo();
		}
	}
	
	public int size() {
		return restaurants.size();
	}
	
	public RestaurantInput get(int index) {
		return (Restaurant) restaurants.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Restaurant Info Edit Menu **");
		System.out.println("1. Edit favoriteranking");
		System.out.println("2. Edit name");
		System.out.println("3. Edit address");
		System.out.println("4. Edit phonenumber");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5:");	
	}
	
}