import java.util.*;

public class Numprog2
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean e = true;
        do {
            System.out.println("Enter the Number : ");
            int a = x.nextInt();

            System.out.println("Select the input : ");
            System.out.println("1. Count the Odd \n2. Sum of Odd \n3. Product of Odd \n4. Exit");
            int s = x.nextInt();

            switch (s)
            {
                case 1 : {
                    System.out.println("\nCount of Odd \n");
                    OddCount(a);
                    break;}
                case 2 : {
                    System.out.println("\nSum of Odd \n");
                    OddSum(a);
                    break;}
                case 3 : {
                    System.out.println("\nSum of Odd \n");
                    OddProduct(a);
                    break;}
                case 4 : {
                    e = false;
                    System.out.println("Exiting");
                    break;}

            }



        }while (e);


    }

    public static void OddCount(int b)
    {
        int count = 0;
        int last =0;
        while(b>0)
        {
            last = b%10;

            if(last%2==1)
            {
                count++;
            }

            b/=10;
        }

        System.out.println("The count of Odd numbers in the given number is :  "+count);

    }

    public static void OddSum(int b)
    {
        int sum = 0;
        int last =0;

        while(b>0)
        {
            last = b%10;

            if(last%2==1)
            {
                 sum = sum+last;
            }

            b/=10;
        }

        System.out.println("The Sum of Odd numbers in the given number is :  "+sum);

    }
    public static void OddProduct(int b)
    {

        int prod = 1;
        int last =0;

        while(b>0)
        {
            last = b%10;

            if(last%2==1)
            {
                prod = prod*last;
            }

            b/=10;
        }

        System.out.println("The Product of Odd numbers in the given number is :  "+prod);


    }






}
