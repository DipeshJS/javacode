package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class  frame extends JFrame implements ActionListener
{
	Container c;
	JButton bt1 = new JButton("1");
	JButton bt2 = new JButton("2") ;
	JButton bt3= new JButton("3");
	frame()
	{
		c= this.getContentPane();
		c.setLayout(null);
		bt1.setBounds(100,120,80,40);
		bt2.setBounds(100,180,80,40);
		bt3.setBounds(100,240,80,40);
		
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		
		bt1.addActionListener(this);
		bt3.addActionListener(this);
		bt2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==bt1)
			c.setBackground(Color.RED);

		if (e.getSource()==bt3)
			c.setBackground(Color.YELLOW);

		if (e.getSource()==bt2)
			c.setBackground(Color.GREEN);
	}
}

public class seventhframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frame obj = new frame();
		obj.setVisible(true);
		obj.setBounds(100,100,800,800);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
