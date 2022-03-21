package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class lis extends JFrame implements ItemListener
{
	Container c ;
	String[] s = {"1","2","3","4"};
	JComboBox bx = new JComboBox(s);
	JRadioButton bt = new JRadioButton("hello");
	JCheckBox cx = new JCheckBox("worlds");
	JTextArea tt = new JTextArea();
	
	lis ()
	{
		c = this.getContentPane();
		this.setLayout(null);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		
		
		bx.setBounds(10,30,100,30);
		bt.setBounds(200,30,50,30);
		cx.setBounds(300,30,50,30);
		c.add(bx);
		c.add(bt);
		c.add(cx);
		
		tt.setBounds(10,100,200,200);
		c.add(tt);
		this.setVisible(true);
		
		bx.addItemListener( this);
		bt.addItemListener(this);
		cx.addItemListener(this);
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bx)
		{
			
			tt.setText( bx.getSelectedItem().toString());
		}
		
		if(e.getSource()==bt)
		{
			tt.setText("radiobox");
		}
		
		else if (e.getSource()==cx)
		{
			tt.setText("check");
		}
		
	}
	

	
	
}

public class Itemlistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        lis obj = new lis ();
	}

}
