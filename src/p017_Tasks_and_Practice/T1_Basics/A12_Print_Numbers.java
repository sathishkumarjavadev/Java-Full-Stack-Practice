package p017_Tasks_and_Practice.T1_Basics;

public class A12_Print_Numbers {
    public static void main(String[] args) {
        
        singleline();
        System.out.println("single line function ended");
        multipleline();
        System.out.println("multiple line function ended");
        recursion(1);
        System.out.println("recursion ended");
        switchs();
        System.out.println("switch ended");
        int[] num = {1,2,3,4,5,6};
        arrays(num);
        System.out.println("arrays ended");
    }

   static void singleline()
    {
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n");
    }
    static void multipleline()
    {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
    static void recursion(int num)
    {
        if(num>9)
        {
            return;
        }
        System.out.println(num);
        recursion(num+1);
    }

    static void switchs()
    {
        int num=1;
        switch(num)
        {
            case 1: System.out.println(num);num++;
            case 2: System.out.println(num);num++;
            case 3: System.out.println(num);num++;
            case 4: System.out.println(num);num++;
            case 5: System.out.println(num);num++;
        }
    }
    static void arrays(int num[])
    {
        System.out.println(java.util.Arrays.toString(num));
    }
}