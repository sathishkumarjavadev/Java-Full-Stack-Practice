package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A4_Quotient_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        System.out.println("enter the a value");
        a=obj.nextInt();
        System.out.println("enter the b value");
        b=obj.nextInt();
        System.out.println("division = " + (a/b));
        obj.close();
    }
}
