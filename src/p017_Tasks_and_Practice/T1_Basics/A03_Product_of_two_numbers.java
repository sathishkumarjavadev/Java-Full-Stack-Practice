package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A03_Product_of_two_numbers {

    public static void main(String[] args) {
        
        int a, b, product;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a=");
        a= obj.nextInt();
        System.out.println("enter the value of b=");
        b=obj.nextInt();
        product=a*b;
        System.out.println("product = "+product);
        obj.close();
    }
    
}
