package p008_oops.p008_oops_14_exception_handling;

public class A5BestExample {
	public static void main(String[] args) {
		Integer number = null;
		try {
			System.err.println(number.toString());
		}
		catch (NullPointerException e) {
			System.out.println("number object is null");
		}
		finally {
			System.out.println("execution finished");
		}
}
}
