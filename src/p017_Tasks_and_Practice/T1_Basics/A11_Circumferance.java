package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A11_Circumferance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float radius;
        System.out.println("enter the radius value");
        radius = obj.nextFloat();
        System.out.println("circumferance = "+(2*((float)22/7)*radius));
        obj.close();
        
    }
}
