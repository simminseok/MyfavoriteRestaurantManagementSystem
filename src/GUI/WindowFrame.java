package GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.RestaurantManager;

public class WindowFrame extends JFrame {
	
	RestaurantManager restaurantmanager;
	MenuSelection menuselection;
	RestaurantAdder restaurantadder;
	RestaurantViewer restaurantviewer;
	
	public WindowFrame(RestaurantManager restaurantmanager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.restaurantmanager = restaurantmanager;
		menuselection = new MenuSelection(this);
		restaurantadder = new RestaurantAdder(this, this.restaurantmanager);
		restaurantviewer = new RestaurantViewer(this, this.restaurantmanager);
		this.add(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public RestaurantAdder getRestaurantadder() {
		return restaurantadder;
	}

	public void setRestaurantadder(RestaurantAdder restaurantadder) {
		this.restaurantadder = restaurantadder;
	}

	public RestaurantViewer getRestaurantviewer() {
		return restaurantviewer;
	}

	public void setRestaurantviewer(RestaurantViewer restaurantviewer) {
		this.restaurantviewer = restaurantviewer;
	}
}
