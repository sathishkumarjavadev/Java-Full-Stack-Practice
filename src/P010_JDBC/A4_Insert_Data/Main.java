package P010_JDBC.A4_Insert_Data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;	

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			Statement sobj = drvobj.createStatement();
			String query = "INSERT INTO KGF_TABLE VALUES (105,'Sathish')";
			sobj.executeUpdate(query);
			
			System.out.println("value added successfully");
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}	
