import java.util.Scanner;

class binarytodecimal
{
    static Scanner x = new Scanner(System.in);

         public static void main(String [] args)
        {
            System.out.println("Enter a Binary number : ");
            int binary = x.nextInt();
            int pow = 1;
            int sum = 0;

               while (binary > 0)
               {
                   sum = sum + binary % 10 * pow;

                   pow = pow * 2;

                   binary = binary / 10;


               }


               System.out.println(" Binary to Decimal : " +sum );

        }


}
