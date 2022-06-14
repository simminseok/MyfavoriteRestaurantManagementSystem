package restaurant;

import java.util.Scanner;

public class Koreanfood extends FusionRestaurant {
	public Koreanfood(RestaurantKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setRestaurantfavoriteranking(input);
		setRestaurantName(input);
		setRestaurantAddress(input);
		setRestaurantPhone(input);
	}
}
