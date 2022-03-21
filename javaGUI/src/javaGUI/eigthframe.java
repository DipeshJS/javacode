package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// use of annoynmous inner class for action listner
public class eigthframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setBounds(100,100,400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		JButton bt = new JButton();
		bt.setText("1");
		bt.setBounds(30,30,60,20);
		c.add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e )
			{
				c.setBackground(Color.RED);
			}
		});

	}

}
