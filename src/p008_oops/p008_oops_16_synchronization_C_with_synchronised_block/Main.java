package p008_oops.p008_oops_16_synchronization_C_with_synchronised_block;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		MyThread t1 = new MyThread(printer, "sathish");
		MyThread t2 = new MyThread(printer, "kumar");
		t1.start();
		t2.start();
	}
}
