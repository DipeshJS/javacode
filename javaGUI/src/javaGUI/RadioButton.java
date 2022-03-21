package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setBounds(100,50,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		
		JRadioButton bt1 = new JRadioButton("Male");
		JRadioButton bt2 = new JRadioButton("Female");
		
		bt1.setBounds(100,50,80,30);
		bt2.setBounds(190,50,80,30);
		
		c.add(bt1);
		c.add(bt2);
		
		// to select the radio button beforehand
		bt1.setSelected(true);
		
		ButtonGroup b = new ButtonGroup();
		b.add(bt1);
		b.add(bt2);
		// can not select the radio button
		bt2.setEnabled(false);
		
		
		
		f.setVisible(true);

	}

}
