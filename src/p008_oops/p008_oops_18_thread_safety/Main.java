package p008_oops.p008_oops_18_thread_safety;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		
		Counter counter = new Counter();
		
		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Count = "+ counter.getCount());
	}
}
