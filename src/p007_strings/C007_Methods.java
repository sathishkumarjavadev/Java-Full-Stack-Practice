package p007_strings;

import java.util.Arrays;

public class C007_Methods {

	public static void main(String[] args) {
		
		String name = "hello world sathish";
		String name2 = "";
		System.out.println(name);
		System.out.println(Arrays.toString(name.toCharArray()));
		for(char i:name.toCharArray())
		{
			name2=name2+i;
			System.out.println(name2);
		}
		System.out.println(name2);
		System.out.println(name.indexOf('a'));
		
		System.out.println(Arrays.toString(name.split(" ")));
		System.out.println("  s a t h i s h    ".strip());
		System.out.println("  s a t h i s h    ".trim());
	}
}
