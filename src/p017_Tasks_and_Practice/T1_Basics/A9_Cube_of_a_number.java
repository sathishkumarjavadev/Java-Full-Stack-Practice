package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A9_Cube_of_a_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float num;
        System.out.println("enter the value to get the cube of it");
        num = obj.nextFloat();
        System.out.println("the cube of the number is = "+(num*num*num));
        obj.close();
    }
}
