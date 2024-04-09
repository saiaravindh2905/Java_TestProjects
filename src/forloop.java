import java.util.Scanner;

public class forloop
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {

        int i ;
        System.out.println("Enter a number : ");
        int a = x.nextInt();                                // Incomplete
        int b = 1;

        for ( i = 1 ; i<=a ; i++)
        {
           if (a%2 == 0)
           {
               System.out.println("It is Divisible by "+i);
           }


        }

        System.out.println(b);

    }

}
