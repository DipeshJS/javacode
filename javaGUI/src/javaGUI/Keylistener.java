package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
 class sparshi extends JFrame implements KeyListener
 {
	 Container c ;
		
		JTextField t1;
		
		JTextArea ta;
		
		
		sparshi()
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
			
			t1.addKeyListener(this);
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.setText(ta.getText()+"key types");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.setText(ta.getText()+"key pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		ta.setText(ta.getText()+"/t"+"key realeased");
	}
	 
 }
public class Keylistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sparshi aman = new sparshi ();

	}

}
