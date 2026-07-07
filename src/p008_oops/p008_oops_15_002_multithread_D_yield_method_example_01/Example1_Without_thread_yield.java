package p008_oops.p008_oops_15_002_multithread_D_yield_method_example_01;

public class Example1_Without_thread_yield {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main : "+ i);
		}
	}

}
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child : "+ i);
			Thread.yield();
		}
	}
}