import java.util.Scanner;

public class MyfavoriteRestaurantManagementSystem {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		RestaurantManager restaurantmanager = new RestaurantManager(input);

		while (num != 5) {
			System.out.println("1. Add restaurant");
			System.out.println("2. Delete restaurant");
			System.out.println("3. Edit restaurant");
			System.out.println("4. View restaurant");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");

			num = input.nextInt();

			if (num == 1) {
				restaurantmanager.addrestaurant();
			}
			else if (num == 2) {
				restaurantmanager.deleterestaurant();
			}
			else if (num == 3) {
				restaurantmanager.editrestaurant();
			}
			else if (num == 4) {
				restaurantmanager.viewrestaurant();
			}
		}
	}
}