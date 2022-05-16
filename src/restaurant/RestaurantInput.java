package restaurant;

import java.util.Scanner;

import exception.PhoneFormatException;

public interface RestaurantInput {
	
	public String getName(); 
	
	public void setFavoliteranking(int favoliteranking);
	
	public void setName(String name);
	
	public void setAddress(String address);
	
	public void setPhone(String phone) throws PhoneFormatException;
	
	public void printInfo();

	public void getUserInput(Scanner input);
	
	public void setRestaurantfavoliteranking(Scanner input);
	
	public void setRestaurantName(Scanner input);
	
	public void setRestaurantAddress(Scanner input);
	
	public void setRestaurantPhone(Scanner input);
}
