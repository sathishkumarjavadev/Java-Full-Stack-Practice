package p007_strings;

import java.util.Scanner;

public class C009_Palindrome {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		String name;
		String name2="";
		System.out.println("enter the name ");
		name = obj.next();
		for(int i=name.toCharArray().length;i>0;i--)
		{
			System.out.println(name.toCharArray()[i]);
		}
	}
}