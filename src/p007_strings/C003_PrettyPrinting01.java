package p007_strings;

public class C003_PrettyPrinting01 {

	public static void main(String[] args) {
		float a = 435.34224f;
		System.out.println(a);
		System.out.println();
		System.out.println(Math.PI);
		System.out.println();
		System.out.printf("Pie: %.3f", Math.PI);
		System.out.println();
		System.out.printf("Hello my name is %s and my age is %s %d %f", "sathish","4", 3, 34.5f);
	}
}
/*
placeholders
%c - Character
%d - Decimal number(base 10)
%e - Exponential floating point number 
%i - integer
%o - Octal number 
%s - String 
%u - Unsigned decimal (integer) number 
%x - HexaDecimal number (base 10)
%n - NewLiine
*/