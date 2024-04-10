import java.util.Scanner;

public class Numprog6
{
        static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        //wajp to check whether the given number is perfect number or not

        System.out.println("Enter the number :");
        int a = x.nextInt();
        perfectnumber(a);

    }

    public static void perfectnumber(int b)
    {
        int sum=0;

        for(int i =1; i<b; i++)
        {
            if(b%i==0)
            {
                sum = sum + i;
            }

        }

        if(sum==b)
        {
            System.out.println("it is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }

    }

}
