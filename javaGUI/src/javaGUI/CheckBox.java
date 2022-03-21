package javaGUI;
import javax.swing.*;
import java.awt.*;
public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame ();
		obj.setBounds(100,50,400,400);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = obj.getContentPane();
		
		c.setLayout(null);
		
		JCheckBox bt1 = new JCheckBox("I");
		JCheckBox bt2 = new JCheckBox("LOVE");
		
		JCheckBox bt3 = new JCheckBox("YOU");
		
		JCheckBox bt4 = new JCheckBox("Sparshi");
		
		JCheckBox bt5 = new JCheckBox("hate");
		
		bt1.setBounds(50,80,80,30);
		bt5.setBounds(50,120,50,30);
		bt2.setBounds(50,150,80,30);
		bt3.setBounds(50,200,80,30);
		bt4.setBounds(50,250,80,30);
		
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		c.add(bt4);
		c.add(bt5);
		
		bt1.setFont(new Font("arial",Font.BOLD,15));
		
		bt1.setSelected(true);
		bt5.setEnabled(false);
		
		
		
		
		obj.setVisible(true);
	}

}
