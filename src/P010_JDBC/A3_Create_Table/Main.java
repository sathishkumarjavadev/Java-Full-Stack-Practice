package P010_JDBC.A3_Create_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			Statement sobj = drvobj.createStatement();
			String query = 
			"create table KGF_Table ("+
			"employeeid int primary key,"+
			"employeename varchar(20))";
			sobj.executeUpdate(query);
			
			
			System.out.println("KGF_TABLE created successfully");
			sobj.close();
			drvobj.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


/*
executeQuery(String sql) --> SELECT
executeUpdate(String sql) --> CREATE, INSERT, UPDATE, DELETE
execute(String sql)	--> Execute any SQL
close() --> close statement
*/