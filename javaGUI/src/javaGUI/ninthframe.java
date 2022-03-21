package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class out implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ninthframe.c.setBackground(Color.RED);
	}
	
}
class ou implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ninthframe.c.setBackground(Color.PINK);
	}
	
}
class o implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ninthframe.c.setBackground(Color.GREEN);
	}
	
}
public class ninthframe {
	
	public static Container c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame() ;
		obj.setVisible(true);
		obj.setBounds(100,100,500,500);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c= obj.getContentPane();
		c.setLayout(null);
		JButton bt1 =  new JButton("1");
		JButton bt2 =  new JButton("2");
		JButton bt3 =  new JButton("3");
		bt1.setBounds(30,40,40,30);
		bt2.setBounds(150,40,40,30);
		bt3.setBounds(200,40,40,30);
		
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		
		out yo  = new out();
		ou k  = new ou();
		o h  = new o();
		
		bt1.addActionListener(yo);
		bt2.addActionListener(k);
		bt3.addActionListener(h);
		

	}

}
