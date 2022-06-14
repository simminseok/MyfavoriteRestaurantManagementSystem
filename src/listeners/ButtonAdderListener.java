package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RestaurantAdder;
import GUI.RestaurantViewer;
import GUI.WindowFrame;

public class ButtonAdderListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAdderListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getRestaurantadder());
		frame.revalidate();
		frame.repaint();
	}
}
