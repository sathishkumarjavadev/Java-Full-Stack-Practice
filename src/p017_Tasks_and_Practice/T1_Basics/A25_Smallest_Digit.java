package p017_Tasks_and_Practice.T1_Basics;

public class A25_Smallest_Digit {
    public static void main(String[] args) {
        SmallestDigit(34245);//test case : positive number
        SmallestDigit(-42573);//test case : negative number
        SmallestDigit(0);//test case : neutral number 
    }
    static void SmallestDigit(int num)
    {
    	if(num<=0)
    	{
    		num=num*(-1);
    	}
    	int min=num;
    	while(num!=0)
    	{
    		int digit = num%10;
    		if(digit < min)
    		{
    			min = digit;
    		}
    		num = num/10;  
    	}
    	System.out.println(min);
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