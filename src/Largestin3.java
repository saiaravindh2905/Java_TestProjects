import java.util.Scanner;
class Largestin3
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tLARGEST IN THREE NUMBERS");

        System.out.println("Enter the first number = ");
        int a = x.nextInt();
        Thread.sleep(500);

        System.out.println("Enter the second number = ");
        int b = x.nextInt();
        Thread.sleep(500);

        System.out.println("Enter the third number = ");
        int c = x.nextInt();
        Thread.sleep(500);

        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (a>=b && a>=c)
        {
            System.out.println("The largest number is " +a);
        }

        if (b>=c && b>=a)
        {
            System.out.println("The largest number is " +b);
        }

        if (c>=a && c>=b)
        {
            System.out.println("The largest number is " +c);
        }

    }

}
