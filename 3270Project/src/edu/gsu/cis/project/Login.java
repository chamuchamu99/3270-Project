package edu.gsu.cis.project;
import java.awt.Dimension;

import javax.swing.*;
public class Login extends User {
	public static void main(String[] args) {
	JFrame frame = new JFrame("Welcome to Java Wings");
	frame.setSize(new Dimension(600, 450));
	
	JPanel pan = new JPanel();
	JButton but1 = new JButton("Log in");
	JButton but2 = new JButton("Register");
	JButton but3 = new JButton ("Admins only");
	
	frame.add(pan);
	pan.add(but1);
	pan.add(but2);
	pan.add(but3);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	
	
	}	

}
