package p007_strings;

import java.util.ArrayList;

public class C004_Operators {

	public static void main(String[] args) {
		
		System.out.println('a'+'b');//195
		System.out.println("a"+"b");//ab
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		System.out.println("a"+1);
		System.out.println("sathish"+new ArrayList<>());
		System.out.println("sathihasa"+new Integer(34));
		int ans = new Integer(56+" "+new ArrayList<>());
		System.out.println(ans);
		
		
		
	}
}
