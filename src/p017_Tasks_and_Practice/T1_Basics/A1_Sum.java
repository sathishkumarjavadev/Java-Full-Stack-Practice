package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A1_Sum {
	public static void main(String[] args) {
		int a, b, sum;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the a and b values");
		a= obj.nextInt();
		b = obj.nextInt();
		sum=a+b;
		System.out.println("sum ="+sum);
		obj.close();
	}
}
