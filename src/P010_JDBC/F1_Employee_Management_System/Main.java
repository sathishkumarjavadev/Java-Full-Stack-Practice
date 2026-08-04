package P010_JDBC.F1_Employee_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scobj = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("==============================");
			System.out.println("Employee Management System");
			System.out.println("==============================");

			System.out.println("1. Add Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");

			System.out.print("Enter Choice : ");
			int choice = scobj.nextInt();
			
			switch(choice)
			{
			case 1:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
					System.out.println("Enter Employee ID :");
					int id = scobj.nextInt();
					System.out.println("Enter Employee Name :");
					String name = scobj.next();
					String query = "insert into kgf_table values (?,?)";
					PreparedStatement psobj = con.prepareStatement(query);
					psobj.setInt(1, id);
					psobj.setString(2, name);
					int rows = psobj.executeUpdate();
					if (rows > 0) {
						System.out.println("id ="+id+" name="+name+" added successfully");
					}
					else
					{
						System.out.println("failed to add employee");
					}
					psobj.close();
					con.close();
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				break;

			case 2:
			    break;

			case 3:
			    break;

			case 4:
			    break;

			case 5:
			    break;

			case 6:
			    System.out.println("Thank You");
			    System.exit(0);
			    default:
			    	System.out.println("enter the choice correctly");
			
			}
		}
	}
	
}
/*
=============================
 Employee Management System
=============================

1. Add Employee
2. View Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Exit

Enter Choice :

concepts covered

✅ Connection
✅ PreparedStatement
✅ ResultSet
✅ CRUD Operations
✅ Scanner
✅ Loops
✅ Exception Handling

 */