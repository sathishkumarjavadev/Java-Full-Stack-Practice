package p008_oops.p008_oops_15_002_multithread_A_example_01;

public class MyThread implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Child Thread running");
	}
}

//Java does not support multiple inheritance with classes.
//
//A class can extend only one class.
//Instead of extending Thread, implement Runnable.

//example code 
//class Employee {
//
//}
//
//class MyThread extends Employee implements Runnable {
//
//}