package edu.gsu.cis.project;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegisterGui  {
	
	JFrame frame;
	JTextField textState;;
	JTextField textName;
	JTextField textLast;
	JTextField textAddr;
	JPasswordField ssn;
	JTextField textZip;
	String ssnStr;
	JTextField textUser;
	JPasswordField passW;
	JPasswordField seQ;
	JLabel label;
	JTextField textEmail;
	JButton buttonSubmit;
	
	RegisterGui() {
		
		frame = new JFrame("Register Your Account");
		frame.setSize(420, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		label = new JLabel("Thank you for choosing Java Wings !!");
		label.setLocation(20,10);
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 17));
		label.setSize(label.getPreferredSize());
		frame.add(label);
		
		// label change
		
		label = new JLabel("enter user info into the following fields");
		label.setFont(new Font("veradana", Font.ITALIC, 15));
		label.setSize(label.getPreferredSize());
		label.setLocation(10,  50);
		frame.add(label);
		
		// label change for each new text field (starting with NAME)
		
		label = new JLabel("First Name*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 80);
		frame.add(label);
		
		// this is the text field for First Name
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setSize(textName.getPreferredSize());
		textName.setLocation(80, 80);
		frame.add(textName);
		
		
		// change label for LAST NAME
		
		label = new JLabel("Last Name*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 120);
		frame.add(label);
		
		//make new field for Last Name
		
		textLast = new JTextField();
		textLast.setColumns(10);
		textLast.setSize(textLast.getPreferredSize());
		textLast.setLocation(80,  120);
		frame.add(textLast);
		
		
		//new label for address
		
		label = new JLabel("Address*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 160);
		frame.add(label);
		
		// text field for address is next
		
		textAddr = new JTextField();
		textAddr.setColumns(10);
		textAddr.setSize(textAddr.getPreferredSize());
		textAddr.setLocation(80, 160);
		frame.add(textAddr);
		
		
		//new label for zipcode
		
		label = new JLabel("Zip Code*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10,  200);
		frame.add(label);
		
		
		// new text field for zip
		
		
		
		textZip = new JTextField();
		textZip.setColumns(10);
		textZip.setSize(textZip.getPreferredSize());
		textZip.setLocation(80, 200);
		frame.add(textZip);
		
		// change label for state
		
		label = new JLabel("State*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 240);
		frame.add(label);
		
		
		
		// setup text field for state
		
		textState = new JTextField();
		textState.setColumns(10);
		textState.setSize(textState.getPreferredSize());
		textState.setLocation(80, 240);
		frame.add(textState);
		
		//label change for username
		
		label = new JLabel("Username*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 280);
		frame.add(label);
		
		
		
		
		// next text field is for username
		
		textUser = new JTextField();
		textUser.setColumns(10);
		textUser.setSize(textUser.getPreferredSize());
		textUser.setLocation(80,280);
		frame.add(textUser);
		
		// chagne label for password
		
		
		label = new JLabel("password*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 320);
		frame.add(label);
		
		// char[] for password password field
		
		
		
		passW = new JPasswordField();
		passW.setColumns(10);
		passW.setSize(passW.getPreferredSize());
		passW.setLocation(80, 320);
		frame.add(passW);
		
		
		// label change for email
		
		label = new JLabel("Email*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 360);
		frame.add(label);
		
		// add email field
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setSize(textEmail.getPreferredSize());
		textEmail.setLocation(80, 360);
		frame.add(textEmail);
		
		
		//change label to security question
		
		
		
		label = new JLabel("Favorite TV Show?");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 400);
		frame.add(label);
		
		
		
		//make sequrity ? field char[]
		
		
		seQ = new JPasswordField();
		seQ.setColumns(10);
		seQ.setSize(seQ.getPreferredSize());
		seQ.setLocation(120, 400);
		frame.add(seQ);
		
		//make ssn label 
		
		label = new JLabel("SSN*");
		label.setSize(label.getPreferredSize());
		label.setLocation(10, 440);
		frame.add(label);
		
		
		// make ssn field
		
		ssn = new JPasswordField();
		ssn.setColumns(10);
		ssn.setSize(ssn.getPreferredSize());
		ssn.setLocation(80, 440);
		frame.add(ssn);
		
		// convert ssn char[]
		
		ssnStr = ssn.getPassword().toString();
		
		// make strings and char[] for every getText() and getPassword()
		
		String na = textName.getText();
		String ln = textLast.getText();
		String add = textAddr.getText();
		String zp = textZip.getText();
		String sta = textState.getText();
		String us = textUser.getText();
		String pasw = passW.getPassword().toString();
		String ema =textEmail.getText();
		String security = seQ.getPassword().toString();
		
		
		
		
		
		
		
		// make a submit button
		
				
		buttonSubmit = new JButton("Register");
		buttonSubmit.setSize(buttonSubmit.getPreferredSize());
		buttonSubmit.setLocation(150, 500);
		buttonSubmit.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						User.insertSSN(ssnStr);
						new User(na, ln, add, zp, sta, us, pasw, ema, security);
						
					}
					
					
					
				});
		
		frame.add(buttonSubmit);
		frame.setVisible(true);
		
		
		
		
		

	}
		
		
		
		
		
	

	public static void callRegister() {
		new RegisterGui();
		
	}
		
		
		
	

}