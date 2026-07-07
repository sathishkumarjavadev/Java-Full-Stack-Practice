package p008_oops.p008_oops_14_exception_handling;

public class A2NullPointerException {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Cannot find the length");
			// TODO: handle exception
		}
		finally {
			System.out.println("final statement");
		}
	}
}
