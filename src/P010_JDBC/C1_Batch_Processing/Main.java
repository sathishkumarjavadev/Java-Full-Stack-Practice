package P010_JDBC.C1_Batch_Processing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB", "root", "root" );
			Statement stmt = con.createStatement();
			String q1 = "insert into KGF_TABLE values (304,'AAA')";
			String q2 = "insert into KGF_TABLE values (404,'AAA')";
			String q3 = "insert into KGF_TABLE values (940,'AAA')";
			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);
//			stmt.addBatch(q3);//it will not get execute because there is already a primary key
			int result[] = stmt.executeBatch();
			for(int i:result)
			{
				System.out.println(i+" query runs");
			}
			stmt.clearBatch();
			System.out.println("Batch executed successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}


//
//One-Line Definition
//
//Batch Processing is used to execute multiple SQL queries together in one database call, improving performance
//
//addBatch()      → Store
//executeBatch()  → Execute
//clearBatch()    → Clear	
//
//
//Purpose
//---------
//Execute multiple SQL queries together.
//
//Flow
//---------
//Connection
//↓
//Statement
//↓
//addBatch()
//↓
//executeBatch()
//↓
//clearBatch()
//
//Methods
//---------
//addBatch()      → Store
//executeBatch()  → Execute
//clearBatch()    → Clear
//
//Benefits
//---------
//✔ Faster
//✔ Fewer database trips
//✔ Better performance
//✔ Used for bulk operations
//
//
//
//----------------------------------------------------------------------------------------------
//Real-Time Example (Tanglish)
//
//Imagine you're sending WhatsApp messages.
//
//Without Batch:
//
//Hi
//↓
//
//Send
//
//How are you?
//↓
//
//Send
//
//Good Morning
//↓
//
//Send
//
//Three internet requests.
//
//With Batch:
//
//You type
//
//Hi
//
//How are you?
//
//Good Morning
//
//All are ready.
//
//Then press Send once.
//
//That's exactly what executeBatch() does.