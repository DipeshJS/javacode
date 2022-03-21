package javaGUI;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
public class eleventhframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		
		obj.setBounds(100,100,400,400);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = obj.getContentPane();
		c.setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setText("yo");
		Font font = new Font ("Arial",Font.BOLD ,12);
		ta.setFont(font);
		ta.setBounds(20,20,100,100);
		//ta.setEditable(false); 
		ta.setLineWrap(true);
		c.add(ta);
		
		
		obj.setVisible(true);	
	}

}
