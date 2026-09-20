package p017_Tasks_and_Practice.T1_Basics;
import java.util.Scanner;
public class A19_leap_Year {
    
    public static void main(String[] args) {
        leap();    
    }

    static void leap()
    {
        Scanner obj = new Scanner(System.in);
        int year;
        System.out.println("enter the year to check whether the year is leap year or not ");
        year = obj.nextInt();
        if((year%4)==0)
        {
            if((year%100)==0)
            {
                if((year%400)==0)
                {
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not a leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        } 
        else
        {
            System.out.println("not a leap year");
        }
        obj.close();
    }
}
