package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.text.*;
public class fifthframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		obj.setBounds(100,100,300,300);
		Container c = obj.getContentPane();
		
		c.setLayout(null);
		JButton bt = new JButton("SUBMIT");
		bt.setBounds(40,50,100,40);
		Font font = new Font("Arial",Font.PLAIN,12);
		bt.setFont(font);
		
		bt.setText("MY button");
		
		bt.setBackground(Color.RED);
		bt.setForeground(Color.BLUE);
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		bt.setCursor(cur);
		
		
		//bt.setEnabled(false);
		
		//bt.setVisible(false);
		
		
		c.add(bt);
		
		

	}

}
