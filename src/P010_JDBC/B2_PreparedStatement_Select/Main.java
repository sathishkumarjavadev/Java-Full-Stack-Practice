package P010_JDBC.B2_PreparedStatement_Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			String query = "select * from kgf_table where employeeid = ?";
			PreparedStatement sobj = drvobj.prepareStatement(query);
			sobj.setInt(1, 108);
			ResultSet rs = sobj.executeQuery();
			
			rs.close();
			sobj.close();
			drvobj.close();
			while(rs.next())
			{
				System.out.println(rs.getInt("employeeid"));
				System.out.println(rs.getString("employeename"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
