package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class sign extends JFrame implements ActionListener
 {
	 Container c ;
	 JLabel l1 = new JLabel("Name ");
	 
	 JLabel l2 = new JLabel("USERNAME");
	 JLabel l3 = new JLabel("Password");
	 
	 JTextField t1;
	 JTextField t2;
	 
	 JPasswordField ps;
	 
	 JButton bt ; 
	 
	 sign ()
	 {
		
		 setTitle("SIGN UP");
		 setBounds(100,160,500,350);
		 c=getContentPane();
		 setLayout(null);
		 
		 
		 
		 
		 l1.setBounds(50,30,80,30);
		 l2.setBounds(50,70,80,30);
		 l3.setBounds(50,110,80,30);
		 t1 = new JTextField();
		 t2 = new JTextField();
		 
		 ps = new JPasswordField();
		 ps.setBounds(150,120,150,30);
		 t1.setBounds(150,30,150,30);
		 t2.setBounds(150,80,150,30);
		 
		 
		 bt = new JButton("Sign up");
		 bt.setBounds(130,180,80,30);
		 
		 c.add(l1);
		 c.add(l2);
		 c.add(l3);
		 c.add(t1);
		 c.add(t2);
		 c.add(ps);
		 c.add(bt);
		 
		 bt.addActionListener(this);
		 
		 setVisible(true);
		 
	 }
		 
		 
		 
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = t1.getText();
		String username = t2.getText();
		char ch[] = ps.getPassword();
		// TODO Auto-generated method stub
		if (username.equals("root"))
		{
			JFrame suc = new JFrame();
			suc.setVisible(true);
			Container cm = suc.getContentPane();
			cm.setLayout(null);
			suc.setBounds(300,300,300,300);
			JLabel lab = new JLabel("USER EXIST");
			lab.setBounds(100,100,300,50);
			suc.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			dispose();
			cm.add(lab);
			
		}
		
		else
		{
			JFrame suc = new JFrame();
			suc.setVisible(true);
			Container cm = suc.getContentPane();
			cm.setLayout(null);
			suc.setBounds(300,300,300,300);
			JLabel lab = new JLabel("SIGN UP SUCCESSFUL");
			lab.setBounds(70,100,300,50);
			suc.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			dispose();
			cm.add(lab);
			
		}
		
		
	}
 }
public class signUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sign obj = new sign(); 
	}

}
