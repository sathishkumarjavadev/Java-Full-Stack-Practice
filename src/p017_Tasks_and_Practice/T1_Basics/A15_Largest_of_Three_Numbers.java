package p017_Tasks_and_Practice.T1_Basics;

public class A15_Largest_of_Three_Numbers {
    
    public static void main(String[] args) {
        largest(4, 4, 4);
    }
    static void largest(int a, int b, int c)
    {
        if((a==b)&&(a==c))
        {
            System.out.println("all three are equal");
        }
        else
        {
            if((a>=b)&&(a>=c))
                {
                    System.out.println("A is largest");
                }
            else
            {
                if(b>=c)
                {
                    System.out.println("B is largest");
                }
                else{
                    System.out.println("C is largest");
                }
            }
        }
        }
    }
