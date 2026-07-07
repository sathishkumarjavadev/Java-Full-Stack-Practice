package p008_oops.p008_oops_15_001_thread_example_02;

public class Demo {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		
		obj.start();
		obj.run2();
	}
}
