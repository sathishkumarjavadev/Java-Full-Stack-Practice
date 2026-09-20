package p017_Tasks_and_Practice.T1_Basics;

import java.util.Scanner;

public class A18_number_divisible {
    public static void main(String[] args) {
        divisible();
        divisibility_checker();
    }
    static void divisible()
    {
        float num, divider;
        System.out.println("enter the number you wish to divide eg:('numerator')");
        Scanner obj = new Scanner(System.in);
        num = obj.nextFloat();
        System.out.println("enter the number you need to divide by eg:('denominator')");
        divider = obj.nextFloat();
        if(num == 0)
        {
            System.out.println("zero cant be divided");
        }
        else if(divider == 0)
            {
                System.out.println("denominator cant be zero , so the ans is infinity");
            }
            else{
                System.out.println((float)(num/divider));
            } 
            obj.close();
        }
        static void divisibility_checker()
        {
            float num,divider;
            Scanner obj1 = new Scanner(System.in);
            System.out.println("enter the numerator");
            num = obj1.nextFloat();
            System.out.println("enter the divider (denominator) ");
            divider = obj1.nextFloat();
            if (divider == 0) {
                System.out.println("Divider cannot be zero");
            }
            else
                if((num % divider)==0)
                    {
                        System.out.println("the "+num+" is divisible by "+divider);
                    }
                    else
                        {
                            System.out.println("the "+num+" is not divisible by "+divider);
                        }
                        obj1.close();
                    }
                }