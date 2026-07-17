package p008_oops.p008_oops_16_synchronization_A_without_synchronisation;

public class Printer {
	public void printdocuments(String name) {
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

// this method  is implemented without synchronisation , in the next example we will update the code with the synchronisation