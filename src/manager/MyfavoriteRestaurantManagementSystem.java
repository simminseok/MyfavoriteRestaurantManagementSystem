package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MyfavoriteRestaurantManagementSystem {
	
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RestaurantManager restaurantmanager = getObject("restaurantmanager.ser");
		if (restaurantmanager == null) {
			restaurantmanager = new RestaurantManager(input);
		}
		else {
			restaurantmanager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(restaurantmanager);
		selectMenu(input, restaurantmanager);
		putObject(restaurantmanager, "restaurantmanager.ser");
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
					logger.log("add a student");
					break;
				case 2:
					restaurantmanager.deleterestaurant();
					logger.log("delete a student");
					break;
				case 3:
					restaurantmanager.editrestaurant();
					logger.log("edit a student");
					break;
				case 4:
					restaurantmanager.viewrestaurant();
					logger.log("edit a list of student");
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

	public static RestaurantManager getObject(String filename) {
		RestaurantManager restaurantmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			restaurantmanager = (RestaurantManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return restaurantmanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return restaurantmanager;
	}

	public static void putObject(RestaurantManager restaurantmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(restaurantmanager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}