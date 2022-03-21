package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;
class myframe extends JFrame implements ActionListener
{
	Container c;
	JButton bt;
	myframe()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		bt = new JButton("Click me ");
		bt.setBounds(100,100,100,80);
		
		c.add(bt);
		bt.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		c.setBackground(Color.YELLOW);
	}
}
public class sixthframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe f = new myframe();
		f.setTitle("Action demo");
		f.setBounds(100,100,700,500);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setResizable(false);
		
	}

}
