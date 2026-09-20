package p017_Tasks_and_Practice.T1_Basics;

public class A20_multiple_of_5_or_not {
    public static void main(String[] args) {
      checker(5);  
      checker2(15);
    }   
    static void checker(int num) 
    {
        if(num%5==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }
    static void checker2(int num)
    {
        if(((num%3)==0)&&((num%5)==0))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}