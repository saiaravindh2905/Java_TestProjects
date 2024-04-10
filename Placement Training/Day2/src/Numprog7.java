import java.util.Scanner;

public class Numprog7
{
    static Scanner x =new Scanner(System.in);

    public static void main(String[] args)
    {
        // wajp to check whether the given number is duck number or not
         // if the number is having 0 in them.. it is a duck number  .. but the 0 is starting in the number.. it is not a duck number

        System.out.println("enter the number : ");
        int a = x.nextInt();

    }

    public static void ducknum(int b)
    {
        int lt,count=0;

        while (b>0)
        {
            if(b%10!=0)
            {
                count++;
            }

        }




    }


}
