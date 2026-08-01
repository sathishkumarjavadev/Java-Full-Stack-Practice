package P010_JDBC.A5_Select_Data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection drvobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			Statement sobj = drvobj.createStatement();
			
			String query = "select * from KGF_TABLE";
			
			ResultSet rs = sobj.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt("employeeid"));
				System.out.println(rs.getString("employeename"));
			}
			rs.close();
			sobj.close();
			drvobj.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

/*
| SQL Operation   | JDBC Method       | Return Type |
| --------------- | ----------------- | ----------- |
| SELECT          | `executeQuery()`  | `ResultSet` |
| INSERT          | `executeUpdate()` | `int`       |
| UPDATE          | `executeUpdate()` | `int`       |
| DELETE          | `executeUpdate()` | `int`       |
| CREATE DATABASE | `executeUpdate()` | `int`       |
| CREATE TABLE    | `executeUpdate()` | `int`       |
*/