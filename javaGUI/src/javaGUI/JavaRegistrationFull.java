package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaRegistrationFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		obj.setSize(700,700);
		obj.setLocationRelativeTo(null);
		obj.setTitle("HEHEHE");
		
		Container c = obj.getContentPane();
		c.setLayout(null);
		
		JLabel tt = new JLabel("Registration from");
		tt.setBounds(120,20,300,40);
		tt.setFont(new Font("Arial",Font.BOLD,20));
		
		
		JLabel l1 = new JLabel("Name");
		JLabel l2 = new JLabel("Mobile");
		JLabel l3 = new JLabel("Gender");
		JLabel l4 = new JLabel("DOB");
		JLabel l5 = new JLabel("Address");
		
		l1.setBounds(20,100,40,30);
		l2.setBounds(20,150,40,30);
		l3.setBounds(20,200,50,30);
		l4.setBounds(20,250,60,30);
		l5.setBounds(20,300,60,30);
		
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		
		JRadioButton bt1 = new JRadioButton("Male");
		JRadioButton bt2 = new JRadioButton("Female");
		String[] s = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		String[] s1 = {"JAN","FEB","MARCH","APRIL","MAY","JUNE","JULY","AUG","SEP","OCT","NOV","DEC"};
		String[] s3 = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011",
				"2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022",
		};
		JComboBox c1 = new JComboBox(s);
		JComboBox c2 = new JComboBox(s1);
		JComboBox c3 = new JComboBox(s3);
		
	
		
		JTextArea tx = new JTextArea();
		JTextArea tx1 = new JTextArea();
		
		
		JCheckBox bx = new JCheckBox("Please Accept terms and Condition");
		
		JButton bt = new JButton("Submit");
		
		
		
		ButtonGroup om = new ButtonGroup();
		om.add(bt1);
		om.add(bt2);
		
		t1.setBounds(100,100,120,30);
		t2.setBounds(100,150,120,30);
		bt1.setBounds(100,200,100,30);
		bt2.setBounds(200,200,100,30);
		c1.setBounds(100,250,60,30);
		c2.setBounds(180,250,60,30);
		c3.setBounds(250,250,60,30);
		tx.setBounds(100,300,200,60);
		bx.setBounds(50,370,250,30);
		bt.setBounds(150,430,110,30);
		
		tx1.setBounds(350,100,300,500);
		tx1.setLineWrap(true);
		tx.setLineWrap(true);
		
		tx1.setText("Describe yourself");
		
		
		JLabel msg = new JLabel();
		msg.setBounds(50,500,200,30);
		
		
		
		
		c.add(tt);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(t1);
		c.add(t2);
		c.add(bt1);
		c.add(bt2);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(tx);
		c.add(tx1);
		c.add(bx);
		c.add(bt);
		c.add(msg);
		
		obj.setVisible(true);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(bx.isSelected())
				JOptionPane.showMessageDialog(null,"FORM SUBMITTED");
				
				
				else 
				{
					msg.setText("Please accept terms and condition");
				}
			}
		});
	}

}

