package p008_oops.p008_oops_15_001_thread_example_02;

public class MyThread extends Thread{
	@Override
	public void run() 
	{
		System.out.println("Thread is running");
	}
	
	public void run2()
	{
		System.out.println("hi");
	}
}
