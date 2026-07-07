package p008_oops.p008_oops_14_exception_handling;

public class A7StringIndexOutOfBoundsException {
	public static void main(String[] args) {
		String name = "sathish";
		try {
			System.out.println(name.charAt(3));
			System.out.println(name.charAt(9));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.err.println("invalid string index");
		}
		finally {
			System.out.println("program ended");
		}
	}
}

//What is StringIndexOutOfBoundsException?
//
//A StringIndexOutOfBoundsException occurs when you 
//try to access a character at an invalid index in a String.