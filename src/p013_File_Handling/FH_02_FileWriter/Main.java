package p013_File_Handling.FH_02_FileWriter;

import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		FileWriter fwobj = new FileWriter("employee.txt");
		fwobj.write("Employee ID : 6001\n");
        fwobj.write("Employee Name : Sathish\n");
        fwobj.write("Salary : 30000\n");
        fwobj.close();
        System.out.println("Data written successfully");
        
		
	}

}
