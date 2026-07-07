package p008_oops.p008_oops_12_access_modifiers_02_public;

public class Student {
	
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;
    
    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}