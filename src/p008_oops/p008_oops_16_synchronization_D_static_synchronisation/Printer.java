package p008_oops.p008_oops_16_synchronization_D_static_synchronisation;

public class Printer 
{
	public static synchronized void print(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(name + ": Page " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}


//Notice:
//
//public static synchronized void print()
//
//Now the lock belongs to:
//
//Printer.class
//
//instead of:
//
//Printer Object