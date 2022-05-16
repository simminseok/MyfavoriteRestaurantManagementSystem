import java.util.InputMismatchException;
import java.util.Scanner;

public class MyfavoriteRestaurantManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RestaurantManager restaurantmanager = new RestaurantManager(input);
		selectMenu(input, restaurantmanager);
	}

	public static void selectMenu(Scanner input, RestaurantManager restaurantmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					restaurantmanager.addrestaurant();
					break;
				case 2:
					restaurantmanager.deleterestaurant();
					break;
				case 3:
					restaurantmanager.editrestaurant();
					break;
				case 4:
					restaurantmanager.viewrestaurant();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Restaurant Management System Menu ***");
		System.out.println("1. Add restaurant");
		System.out.println("2. Delete restaurant");
		System.out.println("3. Edit restaurant");
		System.out.println("4. View restaurant");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}