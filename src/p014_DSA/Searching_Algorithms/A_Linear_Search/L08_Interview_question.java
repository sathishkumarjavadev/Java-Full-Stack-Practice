package p014_DSA.Searching_Algorithms.A_Linear_Search;

public class L08_Interview_question {
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,1,6},{3,3,7}};
		int total = 0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				total = total + arr[i][j];

			}
			System.out.println("sum of row "+(i+1)+" = "+total);
			if(total > max)
				max = total;
			total = 0;
		}
		System.out.println("row contains the highest value is = " + max);
	}
}
/*
 we are having an array of 
 [
 	[1,2,3],
 	[4,1,6],
 	[3,3,7]
 	]
  
row 1 = person 1   
column 1,2,3 = bank accounts of person 1 
  
  step 1 : iterate over the ever rows and sum up the row values
  step 2 : compare with the other rows 
  step 3 : find the greatest
 
 */