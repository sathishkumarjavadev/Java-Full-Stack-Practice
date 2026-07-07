package p008_oops.p008_oops_14_exception_handling;

public class A3ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int arr[]= {12,32,45,56,67,65};
		
		try 
		{
			System.out.println(arr[44]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Enter a valid index.");
			System.err.println(e.getMessage());
			// TODO: handle exception
		}
		finally {
			System.out.println("Program ended");
		}
		
	}
}
