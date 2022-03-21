package javaGUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class login extends JFrame implements ActionListener
{
	 Container c ;
	 JLabel l1 = new JLabel("Username");
	 JLabel l2 = new JLabel("Password");
	 JTextField t = new JTextField();;
	 
	 JPasswordField p= new JPasswordField();
	 JButton bt;
	 
	 login ()
	 {
		 setTitle("Sign In");
		 setVisible(true);
		 setBounds(100,100,400,250);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 c=getContentPane();
		 c.setLayout(null);
		 l1.setBounds(50,30,80,30);
		 l2.setBounds(50,80,80,30);
		 t.setBounds(150,30,150,30);
		 p.setBounds(150,80,150,30);
		  
		 bt = new JButton();
		 bt.setText("LOG IN");
		 
		 bt.setBounds(130,150,80,30);
		 bt.addActionListener(this);
		 
		 c.add(l1);
		 c.add(l2);
		 c.add(t);
		 c.add(p);
		 c.add(bt);
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char ch[] = new char[8];
		ch =p.getPassword();
		
		String s ="";
		for (int i =0; i < ch.length; i++)
		{
		  s=s+ch[i];	
		}
		
		System.out.println(s);
		
		String us=t.getText();
		
		System.out.println(us);
		
		String a = "root";
		String b ="root";
		boolean r = us.equals(a);
		boolean m = s.equals(b) ;
		System.out.println(r+" "+m);
		if (r==true&&m==true)
		{
		    
			JFrame suc = new JFrame();
			suc.setVisible(true);
			Container cm = suc.getContentPane();
			cm.setLayout(null);
			suc.setBounds(300,300,300,300);
			JLabel lab = new JLabel("WELCOME AMAN");
			lab.setBounds(100,100,200,50);
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
			JLabel lab = new JLabel("Wrong data");
			lab.setBounds(100,100,200,50);
			suc.setDefaultCloseOperation(EXIT_ON_CLOSE);
			dispose();
			
			cm.add(lab);
		}
		
		
		
		
		
		
		
		
	}
	
}

public class tenthframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login obj = new login();

	}

}
