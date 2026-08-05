package P010_JDBC.F1_Employee_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			System.out.println("2. Search Employee by ID");
			System.out.println("3. Search Employee by Name");
			System.out.println("4. View All Employees");
			System.out.println("5. Update Employee by ID");
			System.out.println("6. Delete Employee by ID");
			System.out.println("7. Exit");
			
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
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
					System.out.println("Enter the Employeeid (Note: searching using employee id only, because it is unique ) :");
					int id = scobj.nextInt();
					String query = "select * from kgf_table where employeeid = ?";
					PreparedStatement psobj = con.prepareStatement(query);
					psobj.setInt(1, id);
					ResultSet rows = psobj.executeQuery();
					System.out.println("----------------------------");
					System.out.println("Employee ID\tEmployee Name");
					System.out.println("----------------------------");
					boolean found = false;
					while(rows.next())
					{
						found = true;
						System.out.println(rows.getInt("employeeid")+"\t\t"+rows.getString("employeename"));
					}
					if(!found)
					{
						System.out.println("employee not found");
					}
					rows.close();
					psobj.close();
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			    break;
			case 3:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
					System.out.println("enter employee name");
					String name = scobj.next();
					String query = "select * from kgf_table where employeename = ?";
					PreparedStatement psobj = con.prepareStatement(query);
					psobj.setString(1,name);
					ResultSet rows = psobj.executeQuery();
					System.out.println("----------------------------");
					System.out.println("Employee ID\tEmployee Name");
					System.out.println("----------------------------");
					boolean found = false;
					while (rows.next()) {
						found = true;
						System.out.println(rows.getInt("employeeid")+"\t\t"+rows.getString("employeename"));
					}
					if(!found)
					{
						System.out.println("employee not found");
					}
					rows.close();
					psobj.close();
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			    break;
			case 4:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
					String query = "select * from kgf_table";
					PreparedStatement psobj = con.prepareStatement(query);
					ResultSet rows = psobj.executeQuery();
					System.out.println("----------------------------");
					System.out.println("Employee ID\tEmployee Name");
					System.out.println("----------------------------");
					boolean allEmployees = false;
					while(rows.next()) {
						allEmployees = true;
						System.out.println(rows.getInt("employeeid")+"\t\t"+rows.getString("employeename"));
					}
					if(!allEmployees)
					{
						System.out.println("empty list or no employees were found ");
					}
					rows.close();
					psobj.close();
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			    break;
			case 5:
			    try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
			        System.out.print("Enter Employee ID to Update : ");
			        int id = scobj.nextInt();
			        System.out.print("Enter New Employee Name : ");
			        String name = scobj.next();
			        String query = "UPDATE kgf_table SET employeename = ? WHERE employeeid = ?";
			        PreparedStatement psobj = con.prepareStatement(query);
			        psobj.setString(1, name);
			        psobj.setInt(2, id);
			        int rows = psobj.executeUpdate();
			        if (rows > 0) {
			            System.out.println("----------------------------");
			            System.out.println("Employee Updated Successfully.");
			            System.out.println("----------------------------");
			        } else {
			            System.out.println("----------------------------");
			            System.out.println("Employee Not Found.");
			            System.out.println("----------------------------");
			        }
			        psobj.close();
			        con.close();
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			    break;
			case 6:
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KGF_DB","root","root");
					System.out.println("Enter Employee ID to delete :");
					int id = scobj.nextInt();
					String query = "Delete from kgf_table where employeeid=?";
					PreparedStatement psobj = con.prepareStatement(query);
					psobj.setInt(1, id);
					int rows = psobj.executeUpdate();
					if(rows>0) {
						System.out.println("----------------------------");
			            System.out.println("Employee Deleted Successfully.");
			            System.out.println("----------------------------");
			        } else {
			            System.out.println("----------------------------");
			            System.out.println("Employee Not Found.");
			            System.out.println("----------------------------");
			        }
					psobj.close();
					con.close();
				}
					catch (Exception e) {
					e.printStackTrace();
				}break;
			case 7:
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