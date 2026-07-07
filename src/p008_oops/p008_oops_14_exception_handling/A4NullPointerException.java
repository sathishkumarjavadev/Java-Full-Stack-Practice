package p008_oops.p008_oops_14_exception_handling;

public class A4NullPointerException {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.err.println("object is null");
		}
		finally {
			System.out.println("Program ended");
		}
	}
}
