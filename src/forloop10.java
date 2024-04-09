import java.util.Scanner;
// VALUE and POWER given....using the given power to multiply the given number.
class forloop10
{
    // power operation
    static Scanner x = new Scanner(System.in);

          public static void main(String [] args)
          {
              System.out.println("ENTER THE NUMBER : ");
              int num = x.nextInt();

              System.out.println("ENTER THE POWER : ");
              int power = x.nextInt();

              int product = 1;

              if (power == 1)
                  System.out.println("Result is "+num);
              else
              {
                  for ( int i = 1 ; i<=power ; i++)
                      product = product * num;

                  System.out.println("result is "+product);

              }

          }

}
