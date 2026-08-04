package P010_JDBC.E2_Callable_Statement_Select;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			
			CallableStatement cs = con.prepareCall("{CALL GET_EMPLOYEE()}");
			
			ResultSet rs = cs.executeQuery();
			
			while(rs.next())
			{
				System.out.println(
						(rs.getInt("employeeid"))+" \t"+(rs.getString("employeename"))
						);
			}
			rs.close();
			cs.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
