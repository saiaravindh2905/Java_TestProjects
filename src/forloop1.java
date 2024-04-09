import java.util.Scanner;
//Factorial Number
public class forloop1
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {

        long i ;
        System.out.println("Enter a number : ");
        long a = x.nextInt();
        long b = 1;

        for ( i = 1 ; i<=a ; i++)
        {
            b = b * i;
        }
        Thread.sleep(500);
        System.out.println("\t* *  The factorial number for given number is = " + b);

    }

}
