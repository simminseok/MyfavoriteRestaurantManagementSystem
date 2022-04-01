import java.util.Scanner;

public class RestaurantManager {
	Restaurant restaurant;
	Scanner input;
	RestaurantManager(Scanner input){
		this.input = input;
	}
	public void addrestaurant() {
		restaurant = new Restaurant();
		System.out.print("Favoliteranking: ");
		restaurant.favoliteranking = input.nextInt();
		System.out.print("Restaurant Name: ");
		restaurant.name = input.next();
		System.out.print("Restaurant address: ");
		restaurant.address = input.next();
		System.out.print("Restaurant phone: ");
		restaurant.phone = input.next();   
	}

	public void deleterestaurant() {
		System.out.print("Favoliteranking: ");
		int ranking = input.nextInt();
		if (restaurant == null) {
			System.out.println("the restaurant has not been registered");
			return;
		}
		if (restaurant.favoliteranking == ranking) {
			restaurant = null;
			System.out.println("the restaurant is deleted");
		}
	}

	public void editrestaurant() {
		System.out.print("Favoliteranking: ");
		int ranking = input.nextInt();
		if (restaurant.favoliteranking == ranking) {
			System.out.println("the restaurant to be edited is " + ranking);
		}
	}

	public void viewrestaurant() {
		System.out.print("Favoliteranking: ");
		int ranking = input.nextInt();
		if (restaurant.favoliteranking == ranking) {
			restaurant.printInfo();
		}
	}
}