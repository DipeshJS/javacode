package javaGUI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class sparshi5 extends JFrame implements WindowListener
{
	sparshi5(){
	this.setBounds(100,100,500,500);
     this.setVisible(true);
     this.addWindowListener(this);
	}
	@Override
	
	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window opened ");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window closing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windiw close");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("deiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ACTIVATED");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("deactivated");
	}
	
}

public class windowListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sparshi5 aman = new sparshi5(); 

	}

}
