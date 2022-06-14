package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RestaurantAdder;
import GUI.RestaurantViewer;
import GUI.WindowFrame;

public class RestaurantAdderCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public RestaurantAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
