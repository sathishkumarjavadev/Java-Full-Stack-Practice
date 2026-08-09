package p013_File_Handling.FH_06_BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
	public static void main(String[] args) throws Exception {
		FileReader frobj = new FileReader("employee.txt");
		BufferedReader brobj = new BufferedReader(frobj);
		String data;
		while((data = brobj.readLine())!=null)
			{
			System.out.println(data);
			}
		brobj.close();
		System.out.println("file reading completed");
	}
}