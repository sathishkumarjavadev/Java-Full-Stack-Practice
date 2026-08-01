package P010_JDBC.A7_Delete_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			Statement sobj = drvobj.createStatement();
			String query = "DELETE FROM KGF_TABLE \r\n"
					+"WHERE employeeid = 102";
//			int rs = stmt.executeUpdate(query);
			int deletedrows = sobj.executeUpdate(query);
			System.out.println(deletedrows + "Deleted successfully");
			
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
