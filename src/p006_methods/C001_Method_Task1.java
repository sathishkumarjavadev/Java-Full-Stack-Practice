package p006_methods;

public class C001_Method_Task1 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
	welcome();
	name("sathish");
	}
}
//public  -> access modifier
//static  -> belongs to class
//void    -> no return value
//welcome -> method name
public static void welcome() {
	System.out.println("welcome to java");
}

public static void name(String name) {
	System.out.println("name= "+name);
}
}