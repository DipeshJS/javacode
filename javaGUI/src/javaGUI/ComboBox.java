package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame j = new JFrame ();
		j.setSize(400,400);
		j.setLocationRelativeTo(null);
		Container c = j.getContentPane();
		c.setLayout(null);
		String[] s = {"select","s","w","t"};
		JComboBox obj =  new JComboBox(s);
		obj.setBounds(50,100,120,30);
		
		c.add(obj);
		
		// if dropdown do not contain all option and user want to put his own option 
		
		obj.setEditable(true);
		
		obj.setSelectedIndex(3);
		
		obj.setFont(new Font("arial",Font.ITALIC,9));
		
		obj.addItem("o");
		obj.removeItem("s");
		
		JButton bt = new JButton ("OK");
		
		bt.setBounds(200,100,80,30);
		
		c.add(bt);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				Object m = obj.getSelectedItem();
				
				JOptionPane.showMessageDialog(null,m);
				
			}
		});
		
		j.setVisible(true);

	}

}
