import java.util.Scanner;

public class RestaurantManager {
	Restaurant restaurant = new Restaurant();
	Scanner input;
	RestaurantManager(Scanner input){
		this.input = input;
	}
	public void addrestaurant() {
		System.out.print("Favoliteranking: ");
		int num1 = input.nextInt();
		restaurant.favoliteranking[num1] = num1;
		System.out.print("Restaurant Name: ");
		restaurant.name[num1] = input.next();
		System.out.print("Restaurant address: ");
		restaurant.address[num1] = input.next();
		System.out.print("Restaurant phone: ");
		restaurant.phone[num1] = input.next();   
	}

	public void deleterestaurant() {
		System.out.println("Restaurant FavoliteLanking: ");
		int num1 = input.nextInt();
		System.out.print("Restaurant Name: ");
		String rname = input.next();
		if (restaurant == null) {
			System.out.println("the restaurant has not been registered");
			return;
		}
		if (restaurant.name[num1].equals(rname)) {
			restaurant = null;
			System.out.println("the restaurant is deleted");
		}
	}

	public void editrestaurant() {
		System.out.println("Restaurant FavoliteLanking: ");
		int num1 = input.nextInt();
		System.out.print("Restaurant Name: ");
		String rname = input.next();
		if (restaurant.name[num1].equals(rname)) {
			System.out.println("the restaurant to be edited is " + rname);
		}
	}

	public void viewrestaurant() {
		System.out.println("Restaurant FavoliteLanking: ");
		int num1 = input.nextInt();
		System.out.print("Restaurant Name: ");
		String rname = input.next();
		if (restaurant.name[num1].equals(rname)) {
			restaurant.printInfo(num1);
		}
	}
}