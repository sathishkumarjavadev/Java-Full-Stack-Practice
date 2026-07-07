package p005_arrays;

public class Array_Task02_foreach_loop {
	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,43,50};
		int sum=0;
		for(int i:numbers) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
//in normal loop we use index value, but while using the for each 
//it directly access the value , so we dont need to pass the index 

//for(int i=0; i<numbers.length; i++) {
//    System.out.println(numbers[i]);
//}
//
//for(int num : numbers) {
//    System.out.println(num);
//}