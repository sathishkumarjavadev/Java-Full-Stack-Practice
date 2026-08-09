package p013_File_Handling.FH_12_Serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private int  employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void display() {

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary        : " + salary);		
	}
}

/*


Objects of this class are allowed to be serialized.

Serializable is a marker interface, meaning it doesn't require us to implement any methods.

*/