package p017_Tasks_and_Practice.T1_Basics;

public class A24_Largest_Digit {
    public static void main(String[] args) {
        LargestDigit(34245);
    }
    static void LargestDigit(int num)
    {
    	int max=0;
    	while(num!=0)
    	{
    		int digit = num%10;
    		if(digit > max)
    		{
    			max = digit;
    		}
    		num = num/10;  
    	}
    	System.out.println(max);
    }
}
    	
/*
find the largest digit in a number 
example : 34245
output : the largest digit is 5
 */

//int count =0;
//int original_num = num;
//while(num!=0)
//{
//    num = num/10;
//    count = count+1;
//}