package p007_strings;

public class C008_Palindrome_Using_String_Builder {

	public static void main(String[] args) {
		String name = "madam";
		String reverse = new StringBuilder(name).reverse().toString();
		
		if(name.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
/*
 palindrome using the inbuilt functions ,
 StringBuilder functions 
 */