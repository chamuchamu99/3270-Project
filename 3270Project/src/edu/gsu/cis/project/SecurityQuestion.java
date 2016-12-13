package edu.gsu.cis.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SecurityQuestion implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String url = "jdbc:mysql://colin-PC:3306/fly";
		String user = "root"; 
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);  
					//here fly is database name, root is username and password is Pandor26 
					String userName = ForgotGui.t.getText();
					
					char[] secQ = ForgotGui.sec.getPassword();
					String sqString = new String(secQ);
					
					Statement stmt= con.createStatement();  
					ResultSet rs=(ResultSet) stmt.executeQuery("select passw from customer where user = '" + userName + "' and secq = '" + sqString +"';");  
					while(rs.next())  
						JOptionPane.showMessageDialog(null, "Your password is: " + rs.getString(1));  
						
						con.close();
						
						ForgotGui.fFrame.dispose();
					
				}
				
					
					
					
					catch(Exception e1){ 
						JOptionPane.showMessageDialog(null, "security answer / username mismatch");
						//System.out.println(e1);
						
					}
		
						
				

		
	


	

	}
}