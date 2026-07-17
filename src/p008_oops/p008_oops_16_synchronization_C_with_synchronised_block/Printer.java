package p008_oops.p008_oops_16_synchronization_C_with_synchronised_block;

public class Printer {
	
	public void print(String name) {
		synchronized (this) {
			System.out.println(name + " preparing the document");
			for(int i=1;i<=5;i++)
			{
				System.out.println(name + " : page " + i);
				try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			}
			System.out.println(name +  "Completed Printing");
		}
	}

}
