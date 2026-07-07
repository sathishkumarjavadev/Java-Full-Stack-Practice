package p008_oops.p008_oops_10_encapsulation_new_approach;

public class Student {
	private String name;
	private int age;
	
	public void setName(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return ("name= " + name + " " + "age= " + age);
	}
}
