package p005_arrays;

public class Array_Task01 {
public static void main(String[] args) {
	int numbers[]= {10,20,30,40,43,50};
	int sum=0;
	for(int i=0;i<numbers.length;i++)
		{
		sum = sum+numbers[i];
		System.out.println(numbers[i]);
		}
	System.out.println("sum = "+sum);
	System.out.println("total number of elements present in the numbers is " + numbers.length);
}
}
