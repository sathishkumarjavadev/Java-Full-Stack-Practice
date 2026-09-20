package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A8_Square_of_a_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        float num;

        System.out.println("enter the number to see its square");
        num=obj.nextFloat();
        System.out.println("the square of "+num+" = "+((num)*(num)));
        obj.close();
    }
    
}
