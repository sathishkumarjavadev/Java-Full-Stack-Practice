package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A5_Modulo {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the value of a=");
        a= obj.nextInt();
        System.out.println("enter the value of b=");
        b = obj.nextInt();

        System.out.println("modulo = " + (a%b));
        obj.close();
    }
}
