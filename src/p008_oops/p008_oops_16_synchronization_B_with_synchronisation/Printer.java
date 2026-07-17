package p008_oops.p008_oops_16_synchronization_B_with_synchronisation;

public class Printer {
	public synchronized void printdocuments(String name) {
		for(int i = 1; i<= 5;i++) {
			System.out.println(name + " : Page " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// this method is implemented with synchronisation