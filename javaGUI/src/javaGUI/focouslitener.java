package javaGUI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.event.*;

class sparshi3 extends JFrame implements  FocusListener
{
	 Container c ;
		
		JTextField t1;
		
		JTextArea ta;
		
		
		sparshi3()
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
			t1.addFocusListener(this);

		}


		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			ta.setText("gain");
		}


		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			ta.setText("lost");
		}
		
		
}
public class focouslitener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sparshi3 aman = new sparshi3();

	}

}
