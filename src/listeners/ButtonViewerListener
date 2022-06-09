package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.RestaurantViewer;
import GUI.WindowFrame;
import manager.RestaurantManager;

public class ButtonViewerListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		RestaurantViewer restaurantViewer = frame.getRestaurantviewer();
		RestaurantManager restaurantmanager = getObject("restaurantmanager.ser");
		restaurantViewer.setRestaurantmanager(restaurantmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(restaurantViewer);
		frame.revalidate();
		frame.repaint();
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
}
