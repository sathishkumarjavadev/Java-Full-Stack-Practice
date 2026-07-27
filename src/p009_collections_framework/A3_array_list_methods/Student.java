package p009_collections_framework.A3_array_list_methods;

public class Student {
	int id;
	String name;
	
	Student()
	{
		
	}
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display() 
	{
		System.out.println("id= "+id+" name= "+name);
	}
//the below boolean function is written is for the "contains" method
	public boolean equals(Object obj) 
	{
		Student s = (Student) obj;
		return this.id == s.id;
	}
}