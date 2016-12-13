package edu.gsu.cis.project;
import javax.swing.*;
import java.awt.*;

public class ForgotGui {
	
	static JFrame fFrame;
	static JTextField t;
	static JPasswordField sec;
	JButton button;
	JLabel label;
	JLabel image;
	JPanel panel;
	
	ForgotGui() {
		
		fFrame = new JFrame("security check");
		fFrame.setSize(300, 250);
		fFrame.setLayout(null);
		fFrame.setLocationRelativeTo(null);
		fFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		label = new JLabel("What is your favorite tv show?");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 10);
		fFrame.add(label);
		
		//here the label will change
		
		label = new JLabel("Enter username: ");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 80);
		fFrame.add(label);
		
		sec = new JPasswordField();
		sec.setColumns(15);
		sec.setSize(sec.getPreferredSize());
		sec.setLocation(50, 40);
		fFrame.add(sec);
		
		
		t = new JTextField();
		t.setColumns(15);
		t.setSize(t.getPreferredSize());
		t.setLocation(50, 100);
		fFrame.add(t);
		
		
		
		button = new JButton("fetch password");
		button.setSize(button.getPreferredSize());
		button.setLocation(40, 150);
		button.addActionListener(new SecurityQuestion());
		
		fFrame.add(button);
		
		
		
		
		
		
		fFrame.setVisible(true);
		
		
		
		
	}
	public static void callForgot() {
		new ForgotGui();
	}






}
