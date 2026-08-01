package P010_JDBC.A1_First_Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
//			step 1: load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			step 2: create connection
			Connection drvobj = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql","root","root");
			System.out.println("connected");
//			step3: executing the statement
			Statement sobj = drvobj.createStatement();
			//creating the database
			String Query = "CREATE DATABASE jdbc_connection_final";
			
			sobj.executeUpdate(Query);
			System.out.println("Database created successfully");
				
//			step 3: close connection
			sobj.close();
			drvobj.close();
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
