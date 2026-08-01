package P010_JDBC.A6_Update_Data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			Statement sobj = drvobj.createStatement();
			String query = "UPDATE KGF_TABLE\r\n"
					+ "SET employeename = 'Arun'\r\n"
					+ "WHERE employeeid = 101";
			int updatedrows = sobj.executeUpdate(query);
			System.out.println(updatedrows +"updated successfully");	
			
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
