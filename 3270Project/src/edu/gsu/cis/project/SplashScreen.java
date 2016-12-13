package edu.gsu.cis.project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SplashScreen extends JFrame{
	
	
	private JButton buttonLogin, buttonAdmin, buttonRegister;
	
	
	
	public SplashScreen () {
		
		createUI();
		setTitle("Java Wings 1.0");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setSize(new Dimension(600, 525));
		setLocationRelativeTo(null);
		
		
	}
	private void createUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		JLabel labelImage = new JLabel();
		JLabel textLabel = new JLabel();
		textLabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		labelImage.setIcon(new ImageIcon("C:/Users/Colin/Desktop/coffee.png"));
		textLabel.setText("Welcome to Java Wings Flight Reservation System");
		buttonLogin = new JButton("LOGIN");
		
		buttonLogin.addActionListener(
				new LoginAction()); 
		
		
		
		buttonRegister = new JButton("REGISTER");
		buttonRegister.addActionListener( 
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						RegisterGui.callRegister();
						
					}
					
				});
				
	
		
		buttonAdmin = new JButton("Admins Only");
		
		panel.add(textLabel);
		panel.add(labelImage);
		
		panel.add(buttonLogin);
		panel.add(buttonRegister);
		panel.add(buttonAdmin);
		panel.setBackground(Color.LIGHT_GRAY);
		
		
		
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SplashScreen().setVisible(true);
					
				
				
			}
			
		});
	}
	

}
