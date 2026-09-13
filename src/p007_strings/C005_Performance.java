package p007_strings;

public class C005_Performance {

	public static void main(String[] args) {
		String series="";
		
		for(int i=0;i<26;i++)
		{
			char ch = (char)('a'+i);
			System.out.println(ch);
			series = series + ch+' ';
			
		}
		System.out.println(series);
		
		
	}
}
