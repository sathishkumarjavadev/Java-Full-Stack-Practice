package P010_JDBC.E3_CallableStatement_IN_Parameter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			CallableStatement cs = con.prepareCall("{CALL GET_EMPLOYEE_BY_ID(?)}");
			cs.setInt(1, 94);
			ResultSet rs = cs.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("employeeid") + "\t" + rs.getString("employeename"));
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


//PreparedStatement
//↓
//
//prepareStatement(SQL Query)
//
//----------------------------
//
//CallableStatement
//↓
//
//prepareCall(Stored Procedure)



//-----------------------------------------------------------------------------
//
//Interview Questions
//Q1. Why do we use setInt()?
//
//Answer:
//
//To pass the value of the IN parameter from Java to the Stored Procedure.
//
//Q2. Why is executeQuery() used?
//
//Answer:
//
//Because the Stored Procedure returns data using a SELECT statement.
//
//Q3. What if the Stored Procedure performs only UPDATE or DELETE?
//
//Answer:
//
//Use:
//
//cs.executeUpdate();
//
//instead of
//
//cs.executeQuery();