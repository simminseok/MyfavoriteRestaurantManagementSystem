package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.RestaurantManager;
import restaurant.RestaurantInput;

public class RestaurantViewer extends JPanel {

	WindowFrame frame;

	RestaurantManager restaurantmanager;

	public RestaurantManager getRestaurantmanager() {
		return restaurantmanager;
	}

	public void setRestaurantmanager(RestaurantManager restaurantmanager) {
		this.restaurantmanager = restaurantmanager;
		this.removeAll();

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Favoriteranking");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Contact Info.");

		for (int i =0 ; i< restaurantmanager.size() ; i++) {
			Vector row = new Vector();
			RestaurantInput si = restaurantmanager.get(i);
			row.add(si.getFavoriteranking());
			row.add(si.getName());
			row.add(si.getAddress());
			row.add(si.getPhone());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public RestaurantViewer(WindowFrame frame, RestaurantManager restaurantmanager) {
		this.frame = frame;
		this.restaurantmanager = restaurantmanager;
		System.out.println("***" + restaurantmanager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Favoriteranking");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Contact Info.");

		for (int i =0 ; i< restaurantmanager.size() ; i++) {
			Vector row = new Vector();
			RestaurantInput si = restaurantmanager.get(i);
			row.add(si.getFavoriteranking());
			row.add(si.getName());
			row.add(si.getAddress());
			row.add(si.getPhone());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
