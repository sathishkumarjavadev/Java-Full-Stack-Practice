package P010_JDBC.E5_CallableStatement_INOUT_Parameter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			CallableStatement cs = con.prepareCall("{CALL ADD_BONUS(?)}");
			//send value (IN)
			cs.setInt(1, 25000);
			//Register same parameter as OUT
			cs.registerOutParameter(1, Types.INTEGER);
			//Execute
			cs.execute();
			//Read modified value
			int salary = cs.getInt(1);
			System.out.println("Updated salary :"+ salary);
			cs.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

//
//IN
//
//↓
//
//setXXX()
//
//--------------------
//
//OUT
//
//↓
//
//registerOutParameter()
//
//↓
//
//getXXX()
//
//--------------------
//
//INOUT
//
//↓
//
//setXXX()
//
//↓
//
//registerOutParameter()
//
//↓
//
//getXXX()

//Difference Between IN, OUT and INOUT
//------------------------------------------------
//| Type  | Java → MySQL  |  MySQL → Java | Methods                                          |
//| ----- | ------------  |  ------------ | ------------------------------------------------ |
//| IN    | ✅ Yes        | ❌ No         | `setXXX()`                                       |
//| OUT   | ❌ No         | ✅ Yes        | `registerOutParameter()`, `getXXX()`             |
//| INOUT | ✅ Yes        | ✅ Yes        | `setXXX()`, `registerOutParameter()`, `getXXX()` |
