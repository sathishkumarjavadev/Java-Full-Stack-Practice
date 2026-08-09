package p013_File_Handling.FH_13_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import p013_File_Handling.FH_12_Serialization.Employee;

public class Main {

	public static void main(String[] args) throws Exception{
		FileInputStream fisobj = new FileInputStream("employee.ser");
		
		ObjectInputStream oisobj = new ObjectInputStream(fisobj);
		Employee emp = (Employee) oisobj.readObject();
		oisobj.close();
		System.out.println("Object deserialized successfully");
		emp.display();
	}
}

/*
Employee Object
      ↓
writeObject(emp)
      ↓
employee.ser
      ↓
readObject()
      ↓
Employee Object
      ↓
emp.display()
 */


/*
 
 Text:
FileReader      → Read characters
FileWriter      → Write characters

Buffered:
BufferedReader → Read text line-by-line
BufferedWriter → Write text efficiently

Binary:
FileInputStream  → Read bytes
FileOutputStream → Write bytes

Objects:
ObjectOutputStream → Serialization
ObjectInputStream  → Deserialization
 
 */
 