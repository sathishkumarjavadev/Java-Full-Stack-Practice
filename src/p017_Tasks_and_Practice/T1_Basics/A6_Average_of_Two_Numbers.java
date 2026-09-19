package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A6_Average_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        float avg;
        System.out.println("enter the value of a = ");
        a = obj.nextInt();
        System.out.println("enter the value of b = ");
        b=obj.nextInt();
        avg=((a+b)/2f);
        System.out.println("average = "+avg);
        obj.close();
    }
}
