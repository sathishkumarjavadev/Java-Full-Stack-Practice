package p003_operators;

public class C038_Task1 {
public static void main(String[] args) {
	int a = 10;
	int b = 5;
	int c = 2;
	System.out.println(a + b * c > 20 && a != b);
	
	int x = 15;
	System.out.println(x++ + ++x > 30 ? "YES" : "NO");
	int d = 8;
	int e = 3;
	System.out.println((d & e) + (d | e));
}
}
