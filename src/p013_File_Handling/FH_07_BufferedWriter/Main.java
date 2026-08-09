package p013_File_Handling.FH_07_BufferedWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Main {
	public static void main(String[] args) throws Exception{
		FileWriter frobj = new FileWriter("employee.txt");
		BufferedWriter bwobj = new BufferedWriter(frobj);
		  bwobj.write("Employee ID : 6003");
	        bwobj.newLine();
	        bwobj.write("Employee Name : Ravi");
	        bwobj.newLine();
	        bwobj.write("Salary : 35000");
	        bwobj.newLine();
	        bwobj.close();
	        System.out.println("Data written successfully");
	}
}