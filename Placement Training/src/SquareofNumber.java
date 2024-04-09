import java.util.Scanner;

class SquareofNumber
{

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the number : ");
        long a = x.nextLong();

        System.out.println("The square of the given number is : "+process(a));

    }


    public static long process(long a )
    {
        long res = (a*a);

        return res;

    }







}
