package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RestaurantAdder;
import GUI.RestaurantViewer;
import GUI.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
	    this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
	    JButton b = (JButton) e.getSource();
	    RestaurantAdder adder = frame.getRestaurantadder();
	    frame.setupPanel(adder);
	}
}
