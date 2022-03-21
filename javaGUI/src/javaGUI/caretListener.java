package javaGUI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.event.*;

class sparshi4 extends JFrame implements  CaretListener
{
	 Container c ;
		
		JTextField t1;
		
		JTextArea ta;
		
		
		sparshi4()
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
			t1.addCaretListener(this);

		}


		@Override
		public void caretUpdate(CaretEvent e) {
			// TODO Auto-generated method stub
			ta.setText("caret updated");
			
		}
}
public class caretListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sparshi4 aman = new sparshi4();
	}

}


