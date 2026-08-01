package P010_JDBC.A8_PreparedStatement_Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			String query = "INSERT INTO KGF_TABLE VALUES (?,?)";
			PreparedStatement sobj = drvobj.prepareStatement(query);
			sobj.setInt(1,108);
			sobj.setString(2,"sathtitih");
			sobj.executeUpdate();
			System.out.println("executed successfully");
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
