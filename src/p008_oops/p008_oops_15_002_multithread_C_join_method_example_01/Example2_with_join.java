package p008_oops.p008_oops_15_002_multithread_C_join_method_example_01;

public class Example2_with_join {
	public static void main(String[] args) throws InterruptedException{
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("Hello");
		t.join();
		System.out.println("Bye");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main : " + i);
		}
	}

}
class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child : "+ i);
		}
	}
}

//the join method will make your thread into sequence 