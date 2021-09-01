package gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainWindow extends JFrame{
	public MainWindow(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("J4Stock");
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		
		UpperMenu menu = new UpperMenu();
		this.getContentPane().add(BorderLayout.NORTH, menu);
		
		this.setVisible(true);
	}
}
