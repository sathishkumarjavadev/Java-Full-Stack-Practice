package p006_methods;

public class C002_Method_Types_Task2 {
public static void main(String[] args) {
	TNRN();
	int rs1=TNRS();//we are storing the return methods in a variable , 
//  because if we call normally it will get terminate after execution the codes 
//	which is after will not get run thats why we are storing into an variable and calling them 
	System.out.println(rs1);
	int rs2 =TSRS(4,5);
	System.out.println(rs2);
	TSRN(5,6);
}
//TNRN
public static void TNRN() {
	System.out.println("This is TNRN");
}
//method with return type (TNRS)
public static int TNRS() {
    return 10 + 20;
}
//method with return type (TSRS)
public static int TSRS(int a, int b) {
	return a+b;
}
//TSRN
public static void TSRN(int a, int b) {
	System.out.println(a+b);
}
}