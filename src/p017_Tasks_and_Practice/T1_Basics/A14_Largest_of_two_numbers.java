package p017_Tasks_and_Practice.T1_Basics;

public class A14_Largest_of_two_numbers {
    public static void main(String[] args) {
        largest(5, 5);
    }
    static void largest(int a, int b)
    {
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else
            {
            if(b>a)
            {
                System.out.println("b is greater");
            }
            else{
                if(a==b)
                {
                    System.out.println("a equals b");
                }
            }
        }
    }
}
