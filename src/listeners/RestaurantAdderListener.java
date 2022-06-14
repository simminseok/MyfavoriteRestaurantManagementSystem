package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PhoneFormatException;
import manager.RestaurantManager;
import restaurant.Koreanfood;
import restaurant.Restaurant;
import restaurant.RestaurantInput;
import restaurant.RestaurantKind;

public class RestaurantAdderListener implements ActionListener {
	
	JTextField fieldFavoriteranking;
	JTextField fieldName;
	JTextField fieldAddress;
	JTextField fieldPhone;

	RestaurantManager restaurantmanager;

	public RestaurantAdderListener(
	   	JTextField fieldFavoriteranking, 
		JTextField fieldName, 
		JTextField fieldAddress,
		JTextField fieldPhone, RestaurantManager restaurantmanager) {
		this.fieldFavoriteranking = fieldFavoriteranking;
		this.fieldName = fieldName;
		this.fieldAddress = fieldAddress;
		this.fieldPhone = fieldPhone;
		this.restaurantmanager = restaurantmanager; 
	}

	public void actionPerformed(ActionEvent e) {
		RestaurantInput restaurant = new Koreanfood(RestaurantKind.Koreanfood);
		try {
			restaurant.setFavoriteranking(Integer.parseInt(fieldFavoriteranking.getText()));
			restaurant.setName(fieldName.getText());
			restaurant.setAddress(fieldAddress.getText());
			restaurant.setPhone(fieldPhone.getText());
			restaurantmanager.addrestaurant(restaurant);
			putObject(restaurantmanager, "restaurantmanager.ser");
			restaurant.printInfo();
		} catch (PhoneFormatException e1) {
			e1.printStackTrace();
		}
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
