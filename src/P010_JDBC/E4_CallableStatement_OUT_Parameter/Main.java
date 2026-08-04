package P010_JDBC.E4_CallableStatement_OUT_Parameter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			CallableStatement cs = con.prepareCall("{CALL GET_EMPLOYEE_NAME(?,?) }");
			// IN Parameter
            cs.setInt(1, 94);
            // OUT Parameter
            cs.registerOutParameter(2, Types.VARCHAR);
            // Execute
            cs.execute();
            // Read OUT Parameter
            String employeeName = cs.getString(2);
            System.out.println("Employee Name : " + employeeName);
            cs.close();
            con.close();
            }
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
