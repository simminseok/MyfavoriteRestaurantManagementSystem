package restaurant;

import java.util.Scanner;

public interface RestaurantInput {
	
	public String getName(); 
	
	public void setFavoliteranking(int favoliteranking);
	
	public void setName(String name);
	
	public void setAddress(String address);
	
	public void setPhone(String phone);
	
	public void printInfo();

	public void getUserInput(Scanner input);
}
