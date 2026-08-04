package P010_JDBC.D1_Transactions;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;
public class Main {
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB", "root", "root");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();

            String q1 = "UPDATE KGF_TABLE SET employeename='Raj' WHERE employeeid=101";
            String q2 = "UPDATE KGF_TABLE SET employeename='Vijay' WHERE employeeid=102";
            
            stmt.executeUpdate(q1);
            stmt.executeUpdate(q2);
            con.commit();
            
            System.out.println("Transaction completed successfully");
            stmt.close();
            con.close();
		} catch (Exception e1) {
			try {
				if(con != null) {
					con.rollback();
					System.out.println("Transaction rolled back");
				}
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
			e1.printStackTrace();
		}
	}
}


//Auto Commit ON
//↓
//
//Every query is saved immediately.
//
//-------------------------
//
//Auto Commit OFF
//↓
//
//Execute Query 1
//
//↓
//
//Execute Query 2
//
//↓
//
//Everything Success?
//
//YES
//↓
//
//commit()
//
//NO
//↓
//
//rollback()