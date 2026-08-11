package p014_DSA.Searching_Algorithms.A_Linear_Search;

public class L02_Search_In_Strings {

	public static void main(String[] args) {
		
		String name = "sathish";
		char target = 'i';
		System.out.println(searches(name, target));
		
	}
	static boolean searches(String str, char target) {
		
		if(str.length() == 0) {
			return false;
		}
		for(int i=0;i<str.length();i++)
		{
			if(target == str.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}