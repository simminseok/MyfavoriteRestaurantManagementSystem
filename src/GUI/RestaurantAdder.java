package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.RestaurantAdderCancelListener;
import listeners.RestaurantAdderListener;
import manager.RestaurantManager;

public class RestaurantAdder extends JPanel {
	WindowFrame frame;
	RestaurantManager restaurantmanager;

	public RestaurantAdder(WindowFrame frame, RestaurantManager restaurantmanager) {
		this.frame = frame;
		this.restaurantmanager = restaurantmanager;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelFavoriteranking = new JLabel("Favoriteranking: ", JLabel.TRAILING);
		JTextField fieldFavoriteranking = new JTextField(10);
		labelFavoriteranking.setLabelFor(fieldFavoriteranking);
		panel.add(labelFavoriteranking);
		panel.add(fieldFavoriteranking);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelAddress = new JLabel("Address: ", JLabel.TRAILING);
		JTextField fieldAddress = new JTextField(10);
		labelAddress.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);

		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new RestaurantAdderListener(fieldFavoriteranking, fieldName, fieldAddress, fieldPhone, restaurantmanager));

		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new RestaurantAdderCancelListener(frame));

		panel.add(labelPhone);
		panel.add(fieldPhone);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6); 

		this.add(panel);
		this.setVisible(true);
	}
}
