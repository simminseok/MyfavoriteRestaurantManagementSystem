package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RestaurantViewer;
import GUI.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
	    this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
	    JButton b = (JButton) e.getSource();
	    RestaurantViewer viewer = frame.getRestaurantviewer();
	    frame.setupPanel(viewer);
	}
}
