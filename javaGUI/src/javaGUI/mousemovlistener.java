package javaGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.event.*;

class sparshi2 extends JFrame implements  MouseMotionListener
{
	 Container c ;
		
		JTextField t1;
		
		JTextArea ta;
		
		
		sparshi2()
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
			t1.addMouseMotionListener(this);

		}


		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("drag");
		}


		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			ta.setText("moved");
		}
		
		
		
}		
public class mousemovlistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           sparshi2 aman = new sparshi2();
	}

}
