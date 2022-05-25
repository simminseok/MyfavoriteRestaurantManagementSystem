package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RestaurantAdder extends JFrame{
	
	public RestaurantAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

	    JLabel labelFavoliteranking = new JLabel("Favoliteranking: ", JLabel.TRAILING);
	    JTextField fieldFavoliteranking = new JTextField(10);
        labelFavoliteranking.setLabelFor(fieldFavoliteranking);
        panel.add(labelFavoliteranking);
        panel.add(fieldFavoliteranking);
        
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
        panel.add(labelPhone);
        panel.add(fieldPhone);
        
        panel.add(new JButton("save"));
        panel.add(new JButton("cancel"));
	    
        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	    this.setContentPane(panel);
	    this.setVisible(true);
	}
}
