package p008_oops.p008_oops_15_002_multithread_A_example_01;

public class Main {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();		
//		t.start();
		
	}
}

//note: the thread can be called only once , 
//if we call more than one time it will throw an run time exception 
//called as (IllegalThreadStateException)

//Interview Questions
//1. What is the first state of a thread?
//
//✅ NEW
//
//2. Which method moves a thread from NEW to RUNNABLE?
//start();
//3. Which method executes in the RUNNING state?
//run();
//4. Can we restart a terminated thread?
//
//❌ No.
//
//A thread can only be started once.