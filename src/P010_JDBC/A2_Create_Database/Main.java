package P010_JDBC.A2_Create_Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
			Statement stmt = con.createStatement();
			String query = "create database KGF_DB";
			stmt.execute(query);
			System.out.println("KGF_DB created successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("database already exists");
		}
	}

}
