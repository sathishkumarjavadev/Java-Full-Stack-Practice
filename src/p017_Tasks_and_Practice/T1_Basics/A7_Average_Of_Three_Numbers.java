package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A7_Average_Of_Three_Numbers {

    public static void main(String[] args) {
        
        float num1, num2, num3;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first number");
        num1 = obj.nextFloat();
        System.out.println("enter the second number");
        num2 = obj.nextFloat();
        System.out.println("enter the third number");
        num3 = obj.nextFloat();
        System.out.println("Average = " + ((num1+num2+num3)/3));
        obj.close();
    }
    
}
