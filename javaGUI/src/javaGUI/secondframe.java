package javaGUI;
import java.awt.*;
import java.text.Format;

import javax.swing.*;

public class secondframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		
		obj.setVisible(true);
		
		obj.setBounds(100,100,700,500);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = obj.getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Username"); 
		label.setBounds(100,50,200,30);
		//label.setText("password");
		
		Font font = new Font("Arial",Font.ITALIC,30);
		label.setFont(font);
		
		
		
		c.add(label);
	}

}
