package p008_oops.p008_oops_10_encapsulation_standard_approach;

public class Student {
	private String name;
	private int age;

	public void setName(String name) {
	    this.name = name;
	}

	public String getName() {
	    return name;
	}
	
	public void setAge(int age) {
	    this.age = age;
	}

	public int getAge() {
	    return age;
	}
	
	public String getStudentDetails() {
	    return "name= " + name + " age= " + age;
	}
}
