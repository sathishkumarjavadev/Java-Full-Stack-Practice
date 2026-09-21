package p017_Tasks_and_Practice.T1_Basics;

public class A28_Palindrome_number 
{
	public static void main(String[] args) 
	{
		palindrome(525);//palindrome 
		palindrome(8738);//not a palindrome
		
	}
	
	static void palindrome(int num)
	{
		System.out.println("Original number = "+num);
		int rev = 0;
		int org_num = num;
		while(num!=0)
		{
			int rem;
			rem = num%10;
			{
				rev = (rev*10)+rem;
			}
			num = num/10;
		}
		System.out.println("Reversed number = "+rev);
		if(org_num == rev)
		{
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		System.out.println("Program Completed");
		System.out.println("===================");
	}
	
}