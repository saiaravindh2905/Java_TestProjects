import java.util.Scanner;
class Maximumamong4numbers
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tMAXIMUM AMONG 4 NUMBERS");

        System.out.println("Enter the first number = ");
        int a = x.nextInt();
        Thread.sleep(500);

        System.out.println("Enter the second number = ");
        int b = x.nextInt();
        Thread.sleep(500);

        System.out.println("Enter the third number = ");
        int c = x.nextInt();
        Thread.sleep(500);

        System.out.println("Enter the fourth number = ");
        int d = x.nextInt();
        Thread.sleep(500);

        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (a>b && a>c && a>d)
        {
            System.out.println("The Maximum among 4 numbers is : " +a);
        }

        if (b>c && b>d && b>a)
        {
            System.out.println("The Maximum among 4 numbers is : " +b);
        }

        if (c>a && c>b && c>d)
        {
            System.out.println("The Maximum among 4 numbers is : " +c);
        }

        if (d>a && d>b && d>c)
        {
            System.out.println("The Maximum among 4 numbers is : " +d);
        }


    }

}
