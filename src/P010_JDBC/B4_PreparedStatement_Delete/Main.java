package P010_JDBC.B4_PreparedStatement_Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			String Query = "delete from KGF_TABLE where employeeid = ?";
			PreparedStatement psobj = Drvobj.prepareStatement(Query);
			psobj.setInt(1, 30244);
			int resultset = psobj.executeUpdate();
			System.out.println("deleted successfully "+resultset);
			psobj.close();
			Drvobj.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
