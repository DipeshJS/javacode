package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.text.*;
public class fourthframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame obj = new JFrame();
		 obj.setTitle("Login");
		 obj.setBounds(200,200,300,300);
		 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Container c = obj.getContentPane();
		 c.setLayout(null);
		JLabel l1 = new JLabel("Username");
		l1.setBounds(20,70,100,30);
		c.add(l1);
		
		JLabel l2 = new JLabel("Password");
		l2.setBounds(20,120,100,30);
		
		c.add(l2);
		
		 
		JTextField t1 = new JTextField();
		
		t1.setBounds(100,70,150,30);
		
		c.add(t1);
		 
		 obj.setVisible(true);
		 // to make password use password field instead of text fields
		 JPasswordField t2 = new JPasswordField();
		 
		 t2.setBounds(100,120,150,30);
		 c.add(t2);
		 t2.setText("password");
		 
		 t2.setFont(new Font("Arial",Font.BOLD,12));
		 
		 t2.setEchoChar('*');
		 
		 // to hide and show 
		 
		 t2.setEchoChar((char)0);
		 
		 JButton bt = new JButton("Submit");
		 bt.setBounds(90,180,100,20);
		 
		 c.add(bt);
		 
		 
	}

}
