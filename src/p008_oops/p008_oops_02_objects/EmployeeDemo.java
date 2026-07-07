package p008_oops.p008_oops_02_objects;

public class EmployeeDemo {
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee();
	Employee e2 = new Employee();

	e1.name = "Sathish";
	e1.salary = 15000;
	
	e2.name = "Ravi";
	e2.salary = 20000;

	
	System.out.println(e1.name + " " + e1.salary);
    System.out.println(e2.name + " " + e2.salary);
}
}