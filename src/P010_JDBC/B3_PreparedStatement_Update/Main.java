package P010_JDBC.B3_PreparedStatement_Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			String query = "UPDATE KGF_TABLE SET employeeid = ? ,employeename = ? where employeeid = ?";
			PreparedStatement sobj = drvobj.prepareStatement(query);
			// Placeholder 1 -> New employeeid
			// Placeholder 2 -> New employeename
			// Placeholder 3 -> Existing employeeid (used in WHERE clause)
			sobj.setInt(1, 2203);
			sobj.setString(2, "Arun");
			sobj.setInt(3, 203);
			int  rs = sobj.executeUpdate();
			System.out.println(rs+" executed successfully");
			
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
