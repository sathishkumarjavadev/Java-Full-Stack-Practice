package P001_java_Basic;
/*
 * Topic: Default Values
 *
 * Definition:
 * Default values are automatically assigned to
 * instance and static variables by Java if no value is provided.
 *
 * Key Points:
 * ✓ Local variables do NOT get default values.
 * ✓ Instance variables get default values.
 * ✓ Static variables get default values.
 *
 * Interview Question:
 * Do local variables get default values?
 *
 * Answer:
 * No. Local variables must be initialized before use.
 */

public class C009_DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean status;
    String name;
    public static void main(String[] args) {
        C009_DefaultValues obj = new C009_DefaultValues();
        System.out.println("byte = " + obj.b);
        System.out.println("short = " + obj.s);
        System.out.println("int = " + obj.i);
        System.out.println("long = " + obj.l);
        System.out.println("float = " + obj.f);
        System.out.println("double = " + obj.d);
        System.out.println("char = [" + obj.c + "]");
        System.out.println("boolean = " + obj.status);
        System.out.println("String = " + obj.name);
    }
}