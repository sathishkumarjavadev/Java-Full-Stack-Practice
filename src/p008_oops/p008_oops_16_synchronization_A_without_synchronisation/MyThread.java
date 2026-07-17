package p008_oops.p008_oops_16_synchronization_A_without_synchronisation;

public class MyThread extends Thread{
	
	Printer printer;
	String user;
	
	MyThread(Printer printer, String user) {
		this.printer = printer;
		this.user = user;
	}
	@Override
	public void run() {
		printer.printdocuments(user);
	}
}
