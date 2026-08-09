package p013_File_Handling.FH_04_FileWriter_Append;

import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fwobj = new FileWriter("employee.txt", true);
		
		fwobj.write("Employee ID : 6002\n");
        fwobj.write("Employee Name : Kumar\n");
        fwobj.write("Salary : 30000\n");
        
        fwobj.close();
        
        System.out.println("Data appended successfully ");
	}
}
