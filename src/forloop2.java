import java.util.Scanner;
//Given Number is Divisible by which numbers
class forloop2
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {

        int i ;
        System.out.println("Enter a number : ");
        int a = x.nextInt();
        int b = 1;

        for ( i = 1 ; i<=a ; i++)
        {
            if (a%i == 0)
            {
                System.out.println("It is Divisible by "+i);
            }


        }


    }

}
