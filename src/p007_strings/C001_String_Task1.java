package p007_strings;

public class C001_String_Task1 {
public static void main(String[] args) {
	String name = "Sathish";
	System.out.println("Length="+name.length());
	System.out.println("Uppercase="+name.toUpperCase());
	System.out.println("Lowercase="+name.toLowerCase());
	System.out.println(name.charAt(0)+" "+name.charAt(3));
	
	//equals operator 
	String s1 = "Java";
	String s2 = "Java";
	System.out.println(s1.equals(s2));
	
	
	//Ignores uppercase/lowercase differences.
	String s3 = "JAVA";
	String s4 = "java";
	System.out.println(s3.equalsIgnoreCase(s4));
	String a = "SATHISH";
	String b = "sathish";
	System.out.println(a.equalsIgnoreCase(b));
	
	//contains() --> Checks whether a String contains another String.
	String course = "Java Full Stack";
	System.out.println(course.contains("Full"));
	//	substring()
	String name2 = "Sathish";
	System.out.println(name2.substring(0,4));
	//replace()
	String s = "Java";
	System.out.println(s.replace("Java","Python"));
	//trim() --> Removes spaces at the beginning and end.
	System.out.println(s.trim());
	//split()-->Splits a String into an array.
	String j = "Java,Spring,SQL";
	String[] arr = j.split(",");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	//StringBuffer topic
	StringBuffer sb = new StringBuffer("Java ");
	sb.append("Full Stack");
	System.out.println(sb);
	StringBuffer sb2 = new StringBuffer("Hello ");
	sb2.append("sathish");
	System.out.println(sb2);
	
	
	//StringBuilder
	//Same as StringBuffer but faster (not synchronized).
	StringBuilder sb3 = new StringBuilder("Spring ");
	sb3.append("boot");
	System.out.println(sb3);
	
	//task
	String s6 = "Java";

	System.out.println(s6.substring(1,3));
	String s7 = "Java Full Stack";

	System.out.println(s7.contains("Full"));
}
}
/*
 * length()              ✅
 * charAt()              ✅
 * toUpperCase()         ✅
 * toLowerCase()         ✅
 * equals()              ✅
 * equalsIgnoreCase()    ✅
 * contains()            ✅
 * substring()           ✅
 * replace()             ✅
 * trim()                ✅
 * split()               ✅
 * StringBuffer          ✅
 * StringBuilder         ✅
 */
