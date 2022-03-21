package javaGUI;
import java.awt.*;

import javax.swing.*;

public class firstframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		// Visibility of frame is by default false.
		obj.setVisible(true);
		
		// if we press on cross the frame should close
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// to set size of frame.
		
		//obj .setSize(300,300);
		
		// to set location of frame 
		
		//obj.setLocation(100, 50);
		
		// to do work together
		
		obj.setBounds(100,100,1000,500);
		
		// to set title 
		
		obj.setTitle("MY FRAME");
		
		// to set icon 
		
		ImageIcon icon = new ImageIcon("C:\\Users\\aman singh\\Music\\Screenshots");
		
		obj.setIconImage(icon.getImage());
		
		
		Container c = obj.getContentPane();
		
		
		
		obj.getContentPane().setBackground(Color.BLUE);
		
		
		// user is not allowed to resize the jframe.
		
		obj.setResizable(false);
		
		
		
		
	}

}
