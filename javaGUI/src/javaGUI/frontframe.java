package javaGUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class fr extends JFrame implements ActionListener
{
	Container c;
	JButton bt1;
	JButton bt2;
	
   fr()
   {
	setVisible(true);
	setBounds(300,300,400,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("WELCOME");
	c= getContentPane();
	setLayout(null);
	bt1 = new JButton("SIGN IN");
	bt2 = new JButton("LOGIN");
	
	bt1.setBounds(70,100,100,30);
	bt2.setBounds(220,100,100,30);
	
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	
	c.add(bt1);
	c.add(bt2);
   }
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource()==bt1)
		{
			new sign();
			dispose();
		}
		
		if(e.getSource()==bt2)
		{
			 new login();
			 dispose();
		}
	
	
   }
}
public class frontframe {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fr obj = new fr();

	}

}
