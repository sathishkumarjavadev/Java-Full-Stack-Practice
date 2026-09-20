package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A10_Area_Of_Circle
{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        float r;
        float pi=(float)22/7;
        System.out.println("enter the radius");
        r = obj.nextFloat();
        System.out.println("area of the circle = " + (pi*r*r));
        obj.close();
    }
}