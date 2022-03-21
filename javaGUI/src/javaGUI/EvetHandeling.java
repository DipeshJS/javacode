package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class event extends JFrame implements ActionListener
{
	Container c ;
	JButton bt ;
	JTextField t1;
	JMenuBar m;
	JMenu  m1;
	JMenuItem m2;
	JTextArea ta;
	
	event()
	{
		c = this.getContentPane();
		this.setLayout(null);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		ta = new JTextArea();
		bt = new JButton("Ok");
		t1 = new JTextField();
		m2 = new JMenuItem("new ");
		m1 = new JMenu("file");
		m = new JMenuBar();
		m1.add(m2);
		m.add(m1);
		
		bt.setBounds(10,10,100,30);
		c.add(bt);
		t1.setBounds(150,10,100,30);
		c.add(t1);
		
		ta.setBounds (30,60,200,200);
		c.add(ta);
		this.setJMenuBar(m);
		setVisible(true);
		
		bt.addActionListener(this);
		t1.addActionListener(this);
		m2.addActionListener(this);
	
		
	}
	
	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==bt)
				ta.setText("button pressed");
			if(e.getSource()==t1)
				ta.setText("enter pressed");
			if(e.getSource()==m2)
				ta.setText("menu pressed");
			
		}
	
}

public class EvetHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event obj = new event();
	}

}
