package restaurant;

import java.util.Scanner;

public class Japanesefood extends FusionRestaurant {

	public Japanesefood(RestaurantKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setRestaurantfavoliteranking(input);
		setRestaurantName(input);
		setRestaurantAddress(input);
		setRestaurantPhonewithYN(input); 
	}
}