package p008_oops.p008_oops_16_synchronization_A_without_synchronisation;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		MyThread t1 = new MyThread(printer, "sathish");
		MyThread t2 = new MyThread(printer, "kumar");
		t1.start();
		t2.start();
	}
}
//simple to understand , another process will set into the queue , 
//until the previous process gets completed 


//The One Sentence to Remember
//A synchronized method allows only one thread at a time to execute for the same object.
//the others will wait in the queue