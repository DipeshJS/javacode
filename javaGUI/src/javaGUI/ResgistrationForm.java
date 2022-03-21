package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
class reg extends JFrame implements ActionListener
{
	Container c;
	
	JLabel tt = new JLabel("Registration Form"); 
	JLabel l1 = new JLabel("Name:");
	JLabel l2 = new JLabel("Email-ID:");
	JLabel l3 = new JLabel("Create Password:");
	JLabel l4 = new JLabel("Confirm Password:");
	JLabel l5 = new JLabel("Country:");
	JLabel l6 = new JLabel("State:");
	JLabel l7 = new JLabel("Phone NO:");
	
	JButton bt1 = new JButton("Submit");
	JButton bt2 = new JButton("Clear");
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t6 = new JTextField();
	JTextField t7 = new JTextField();
	JTextField t5 = new JTextField();
	
	JPasswordField ps1 = new JPasswordField(); 
	JPasswordField ps2 = new JPasswordField();
	
	
	reg()
	{
		setTitle("Resgistration Form in java");
		setVisible(true);
		setBounds(20,40,800,500);
		c = getContentPane();
		setLayout(null);
		
		tt.setBounds(70,10,200,60);
		tt.setForeground(Color.BLUE);
		
		
		l1.setBounds(50,40,200,60);
		l2.setBounds(50,80,200,60);
		l3.setBounds(50,120,200,60);
		l4.setBounds(50,160,200,60);
		l5.setBounds(50,200,200,60);
		l6.setBounds(50,240,200,60);
		l7.setBounds(50,280,200,60);
		
		
		bt1.setBounds(70,380,100,40);
		bt2.setBounds(200,380,100,40);
		
		
		
		
		t1.setBounds(250,60,400,20);
		t2.setBounds(250,100,400,20);
		ps1.setBounds(250,140,400,20);
		ps2.setBounds(250,180,400,20);
		t5.setBounds(250,220,400,20);
		t6.setBounds(250,260,400,20);
		t7.setBounds(250,300,400,20);
		
		
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		c.add(tt);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(bt1);
		c.add(bt2);
		c.add(t1);
		c.add(t2);
		c.add(ps1);
		c.add(ps2);
		c.add(t5);
		c.add(t6);
		c.add(t7);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String name = t1.getText();
		String E = t2.getText();
		char ch1[] = ps1.getPassword();
		char ch2[] = ps2.getPassword();
		String Country = t5.getText();
		String state = t6.getText();
		String phone=t7.getText();
		
		boolean m = ch1==ch2;
		System.out.println(m);
		
	    if (e.getSource()==bt1)
	    {
	    	if (Arrays.equals(ch1, ch2))
	    	{
	    		JFrame suc = new JFrame();
				suc.setVisible(true);
				Container cm = suc.getContentPane();
				cm.setLayout(null);
				suc.setBounds(100,300,300,300);
				JButton bt = new JButton("ok");
				bt.setBounds(100,150,80,30);
				cm.add(bt);
				JLabel lab = new JLabel("REGISTRATION SUCCESSFUL");
				lab.setBounds(50,100,300,50);
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
				suc.setBounds(100,300,300,300);
				JLabel lab = new JLabel("PASSWORD DONT MATCH");
				lab.setBounds(50,100,300,50);
				suc.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				dispose();
				cm.add(lab);
	    	}
	    }
	    
	    else if (e.getSource()==bt2)
	    {
	    	
	    	t1.setText(null);
	    	t2.setText(null);
	    	ps1.setText(null);
	    	ps2.setText(null);
	    	t5.setText(null);
	    	t6.setText(null);
	    	t7.setText(null);

	    	
	    }
	}
	
	
	
}
public class ResgistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		reg obj = new reg();
	}

}
