package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class thirdframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		
		
		
		obj .setBounds(100,100,600,600);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		obj.setTitle("MY FIRST SWING EXAMPLE");
		
		Container c = obj.getContentPane();
		
		c.setLayout(null);
		
		
		JTextField t1 = new JTextField();
		
		t1.setBounds(100,50,120,30);
		c.add(t1);
		
		JTextField t2 = new JTextField();
		t2.setBounds(100,100,120,30);
		t2.setText("Password");
		Font font = new Font("Arial",Font.BOLD,12);
		t2.setFont(font);
		
		t2.setForeground(Color.GREEN);
		t2.setBackground(Color.YELLOW);
		//can not edit feild value
		//t2.setEditable(false);
		c.add(t2);
		
		
		obj.setVisible(true);

	}

}
