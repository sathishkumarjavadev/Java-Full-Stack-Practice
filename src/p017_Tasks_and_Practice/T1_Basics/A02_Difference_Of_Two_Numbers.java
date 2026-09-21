package p017_Tasks_and_Practice.T1_Basics;
import java.util.Scanner;
public class A02_Difference_Of_Two_Numbers {
    public static void main(String[] args) {

        int a, b, diff;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        a=obj.nextInt();
        System.out.println("enter the value of b =");
        b=obj.nextInt();
        diff= a-b;
        System.out.println("diff = " + diff);
        obj.close();
    }
}