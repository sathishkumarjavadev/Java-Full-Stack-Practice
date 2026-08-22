package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B05_Smallest_Letter_Task {
	
	public static void main(String[] args) {
		
		char[] letters = {'f','h','i','t','w','x','z'};
		char target = 't';
		char result = nextgreatestletter(letters, target);
		System.out.println(result);
	}
	
	public static char nextgreatestletter(char[] letters, char target) {
		 int start =0;
		 int end = letters.length-1;
		 
		 while(start <= end ) {
			 int mid = start + (end - start) / 2;
			 if(target < letters[mid]) {
				 end = mid -1;
			 }
			 else {
				 start = mid+1;
			 }
		 }
		 return letters[start % letters.length];
			 }
		 }