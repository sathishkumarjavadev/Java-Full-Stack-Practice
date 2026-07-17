package p008_oops.p008_oops_16_synchronization_C_with_synchronised_block;

public class MyThread extends Thread{
	
	Printer printer;
	String userName;
	
	MyThread(Printer printer, String userName) {
		this.printer = printer;
		this.userName = userName;
	}
	@Override
	public void run() {
		printer.print(userName);
	}
}
