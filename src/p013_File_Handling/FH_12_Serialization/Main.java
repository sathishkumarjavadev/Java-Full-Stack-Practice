package p013_File_Handling.FH_12_Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Employee emp = new Employee(6001, "sathish", 40000);
		FileOutputStream fosobj = new FileOutputStream("employee.ser");
		ObjectOutputStream oosobj = new ObjectOutputStream(fosobj);
		oosobj.writeObject(emp);
		oosobj.close();
		System.out.println("object serialized successfully");
	}
}
//Employee object
//↓
//ObjectOutputStream
//↓
//writeObject(emp)
//↓
//employee.ser


//oosobj.writeObject(emp);