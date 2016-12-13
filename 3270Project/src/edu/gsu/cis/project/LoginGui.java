package edu.gsu.cis.project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginGui {
	
	JFrame frame;
	JTextField field;
	JLabel label;
	JPasswordField psw;
	JButton b;
	JButton b1;
	LoginGui() {
		
		frame = new JFrame("Java Wings Login");
		frame.setSize(300,175);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		label = new JLabel("enter your username    ");
		label.setLocation(10, 10);
		label.setSize(label.getPreferredSize());
		frame.add(label);
		
		//here the label object gets changed
		
		label= new JLabel("and password");
		label.setLocation(10,  40);
		label.setSize(label.getPreferredSize());
		frame.add(label);
		
		
		
		field = new JTextField();
		field.setColumns(10);
		field.setSize(field.getPreferredSize());
		field.setLocation(135, 10);
		frame.add(field);
		
		psw = new JPasswordField();
		psw.setColumns(10);
		psw.setSize(psw.getPreferredSize());
		psw.setLocation(135, 40);
		frame.add(psw);
		
		
		b = new JButton("Let's Rock !!");
		b.setSize(b.getPreferredSize());
		b.setLocation(90, 75);
		frame.add(b);
		
		
		b1 = new JButton("forgot password?");
		b1.setSize(b1.getPreferredSize());
		b1.setLocation(70, 105);
		b1.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						ForgotGui.callForgot();
					}
					
					
				});
		frame.add(b1);
		
		
		frame.setVisible(true);
		
		
		
	}
	public static void callLogin() {
		new LoginGui();
	}

}
