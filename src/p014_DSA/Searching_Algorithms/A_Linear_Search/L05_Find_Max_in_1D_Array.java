package p014_DSA.Searching_Algorithms.A_Linear_Search;

public class L05_Find_Max_in_1D_Array {
	
	public static void main(String[] args) {
		
		int arr[] = {18, 12, -7, 3, 14, 28};
		
		System.out.println(max(arr));
		
	
	}
	
	static int max(int arr[]) {
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>ans)
				ans = arr[i];
		}
		return ans;
	}
}
