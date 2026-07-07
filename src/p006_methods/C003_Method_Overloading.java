package p006_methods;

public class C003_Method_Overloading {
	public static void main(String[] args) {
		add(12,12);
		add(12,12,12);
	}
	
	public static void add(int a, int b) {
	    System.out.println(a+b);
	}

	public static void add(int a, int b, int c) {
	    System.out.println(a+b+c);
	}
}
