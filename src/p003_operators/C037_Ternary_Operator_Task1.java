package p003_operators;

public class C037_Ternary_Operator_Task1 {
public static void main(String[] args) {
	int a = 10;
System.out.println(	a > 5 ? "Big" : "Small");
int age = 17;

System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
int a1 = 20;
int b1 = 30;
//to check only greater than 
System.out.println(a1>b1?"a1 is bigger" :"b1 is bigger");
//to check greter than along with equal to 
System.out.println(a1 == b1 ? "Equal" : (a1 > b1 ? "a1 is bigger" : "b1 is bigger"));
}
}
