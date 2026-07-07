package p008_oops.p008_oops_11_static_keyword_01_static_variable;

public class Student {
	String name ;
	static String college = "Besant";
	
	Student(String name)
	{
		this.name = name;
	}

	void display()
	{
		System.out.println(name+" "+college);
	}
	
}

