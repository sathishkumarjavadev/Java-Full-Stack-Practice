package p017_Tasks_and_Practice.T1_Basics;

public class A17_Odd_or_Even {
    public static void main(String[] args) {
        odd_or_even(0);
        odd_or_even(-2);
        odd_or_even(4);
    }
    static void odd_or_even(int num)
    {
        if(num>0)
        {
            if(num%2==0)
            {
                System.out.println("even");
            }
            if(num%2!=0)
            {
                System.out.println("odd");
            }
        }
        else
        {
            if(num == 0)
            {
                System.out.println("the number is zero");
            }
            else if(num<0)
            {
                System.out.println("the number is negative");
            }
        }
    }
}