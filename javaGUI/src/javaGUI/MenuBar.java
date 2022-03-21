package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		obj.setSize(300,300);
		obj.setLocationRelativeTo(null);
		obj.setTitle("HEHEHE");
		
		Container c = obj.getContentPane();
		c.setLayout(null);
		
		JMenuBar jbb = new JMenuBar();
		
		JMenu jb = new JMenu("new");
		
		JMenuItem t1 = new JMenuItem("ADD");
		JMenuItem t2= new JMenuItem("Clear");
		
		jb.add(t1);
		jb.add(t2);
		
		JMenu u = new JMenu("edit");
		
		
		JMenuItem y = new JMenuItem("juuu");
		
		
		JMenu  sub= new JMenu ("hello");
		
		JMenuItem p = new JMenuItem ("oooi");
		
		sub.add(p);
		jb.add(sub);
		
		u.add(y);
		
	jbb.add(jb);
	jbb.add(u);
	
	
	
	
	// requires only once .
	obj.setJMenuBar(jbb);
		
		obj.setVisible(true);

	}

}
