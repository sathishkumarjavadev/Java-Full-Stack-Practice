package p008_oops.p008_oops_15_001_thread_example_03;

public class MyThread extends Thread{

	public void run() {
		System.out.println("run() : " + Thread.currentThread().getName());
	}
	
	public void run2() {
		System.out.println("run2() : " + Thread.currentThread().getName());
	}
}
