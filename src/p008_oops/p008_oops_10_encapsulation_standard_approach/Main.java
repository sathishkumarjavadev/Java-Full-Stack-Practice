package p008_oops.p008_oops_10_encapsulation_standard_approach;

public class Main {
	public static void main(String[] args) {
		Student obj = new Student();
		 
		obj.setAge(22);
		obj.setName("sathish");
		System.out.println(obj.getAge());// we have called seperately 
		System.out.println(obj.getName());//we have called seperately
		System.out.println(obj.getStudentDetails());// we have called using the to string method and it was the standard approach
	}
}
