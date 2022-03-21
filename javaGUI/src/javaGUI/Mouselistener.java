package javaGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.event.*;

class sparshi1 extends JFrame implements MouseListener
{
	 Container c ;
		
		JTextField t1;
		
		JTextArea ta;
		
		
		sparshi1()
		{
			c = this.getContentPane();
			this.setLayout(null);
			
			setSize(400,400);
			setLocationRelativeTo(null);
			ta = new JTextArea();
			t1 = new JTextField();
			ta.setBounds (30,60,200,200);
			c.add(ta);
			t1.setBounds(150,10,100,30);
			c.add(t1);
			ta.setLineWrap(true);
			
			this.setVisible(true);
			t1.addMouseListener(this);

		}


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("mouse clicked");
		}


		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("mouse pressed");
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("mouse realeased");
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("mouse entered");
		}


		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("mouse exited");
		}
		
}
public class Mouselistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		sparshi1 aman = new sparshi1 ();

	}

}
