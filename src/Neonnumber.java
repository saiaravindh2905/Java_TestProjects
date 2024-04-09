import java.util.Scanner;

class Neonnumber
{
     static Scanner x = new Scanner(System.in);

        public static void main(String [] args)
        {
               System.out.println("\n\n\t\t\t\t\t *** NEON NUMBER *** \n\n");
               System.out.println("Enter the number : ");
               int number = x.nextInt();

               int a = number * number;
               int last = 0, sum = 0;

               while (a > 0) {
                   last = a % 10;
                   sum = sum + last;
                   a /= 10;

               }

               if (sum == number) {
                   System.out.println("The given number " + number + " is A Neon Number");
               } else {
                   System.out.println("The given number " + number + " is NOT a Neon Number");
               }





        }


}
