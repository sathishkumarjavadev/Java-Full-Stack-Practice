package p017_Tasks_and_Practice.T1_Basics;

public class A13_Swap {
    
    public static void main(String[] args) {
        swapwithtemp(4, 2);
        swapwithouttemp(5,4 );
    }
    static void swapwithtemp(int a, int b)
    {
        System.out.println("before swap"+" a = "+a+" , b = "+b);
        int temp;
        temp = a;
        a=b;
        b= temp;
        System.out.println("after swap"+" a = "+a+" , b = "+b);
    }
    static void swapwithouttemp(int a, int b)
    {
        System.out.println("before swap"+" a = "+a+" , b = "+b);
       a = a + b;//a = 5+4 = 9
        b = a - b;//b=9-4 = 5
        a = a - b;//a=9-5 =4 
        System.out.println("after swap"+" a = "+a+" , b = "+b);
    }
}
