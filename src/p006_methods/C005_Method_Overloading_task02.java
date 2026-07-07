package p006_methods;

public class C005_Method_Overloading_task02 {

	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
	}
	public static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("2 parameter"+sum);
	}
	public static void add(int a, int b, int c) 
	{
		int sum=a+b+c;
		System.out.println("3 parameter"+sum);
	}
}
