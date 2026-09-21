package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A26_Count_Particular_Digit_Present {
    public static void main(String[] args) {
    	
    	countDigit(1223232);
    	
    }
    static void countDigit(int num)
    {
    	int count =0;
    	int search_num;
    	int digit;
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
        			count+=1;
        		}
        		num = num/10;
        	}
        	System.out.println("the number "+search_num+" you searched is appeared "+count+" times");
    	}
    	else
    	{
    		System.out.println("NOTE: check the number and re-enter from 0 to 9 only ");
    	}
    	obj.close();
    }
}