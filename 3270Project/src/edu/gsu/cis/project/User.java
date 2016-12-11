package edu.gsu.cis.project;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class User {
	//establish connection to mysql and make create query method
	public void insertSSN (String ssn) {
	String url = "jdbc:mysql://colin-PC:3306/fly";
	String user = "root"; 
	String password = "root";
	if (ssn.matches("[\\d][\\d][\\d]x-[\\d][\\d]x-[\\d][\\d][\\d][\\d]")) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);  
				//here fly is database name, root is username and password is root 
				Statement stmt = con.createStatement();
				ResultSet set = (ResultSet) stmt.executeQuery("insert into fly.customer (ssn) values (" + ssn + ");");
		}	catch (Exception e) {
			System.out.println(e);
		}
		} else {
			JFrame frame1 = new JFrame();
			JOptionPane.showMessageDialog(frame1, "Please follow the xxx-xx-xxxx format with SSN");
		}
	}
	

	
	
	
	//set up info for customer account
	private String fn;
	
	private String ln;
	
	private String adr;
	
	private int zip;
	
	private String state;
	
	private String unm;
	
	private String psw;
	
	private String email;
	
	private String secQ;
	
	void insert (String f, String l, String a, int z, String st, String u, String p, String sQ) {
		
		String url = "jdbc:mysql://colin-PC:3306/fly";
		String user = "root"; 
		String password = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);  
				//here fly is database name, root is username and password is root 
				Statement stmt = con.createStatement();
				ResultSet set = (ResultSet) stmt.executeQuery("insert into fly.customer (name, lname, address, zip, state, user, passw, secq) "
						+ "values (" + f + "," + l + ", " + a + ", " + z + ", " + st + ", " + u + ", " + p + ", " + sQ + ");");
								
		}	catch (Exception e) {
			System.out.println(e);
		}
		
	}

	
	
	
	
	
}
