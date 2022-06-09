package restaurant;

import java.util.Scanner;

import exception.PhoneFormatException;

public interface RestaurantInput {
	public int getFavoriteranking();
	
	public void setFavoriteranking(int favoriteranking);
	
	public String getName(); 
	
	public void setName(String name);
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public String getPhone();
	
	public void setPhone(String phone) throws PhoneFormatException;
	
	public void printInfo();

	public void getUserInput(Scanner input);
	
	public void setRestaurantfavoriteranking(Scanner input);
	
	public void setRestaurantName(Scanner input);
	
	public void setRestaurantAddress(Scanner input);
	
	public void setRestaurantPhone(Scanner input);
}
