package p017_Tasks_and_Practice.T1_Basics;
import java.util.Scanner;
public class A31_digit_Attendance
{
	public static void main(String[] args) 
	{
		countDigit(4942);
	}
	static void countDigit(int num)
	{
		int search_num;
		int digit;
		int found = 0;
		System.out.println("enter the single digit you want to search it");
		Scanner obj = new Scanner(System.in);
		search_num = obj.nextInt();
		if(search_num>=0 && search_num<=9)
		{
			while(num!=0)
	    	{
	    		digit = num%10;
	    		if(digit == search_num)
	    		{
	    			found = 1;
	    			break;
	    		}
	    		num = num/10;
	    	}
			if (found == 1)
			{
				System.out.println("The number " + search_num + " is present");
				}
			else
			{
				System.out.println("The number " + search_num + " is not present");
				}
			}
		else
		{
			System.out.println("NOTE: Check the number and re-enter from 0 to 9 only");
			}
		obj.close();
	}
}