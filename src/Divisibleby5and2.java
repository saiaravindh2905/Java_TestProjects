import java.util.Scanner;
class Divisibleby5and2
{
    static Scanner x = new Scanner(System.in);

       public static void main(String [] args)throws Exception
       {
            System.out.println("\t\t\t CHECK DIVISIBILITY OF BOTH 5 & 7");
            Thread.sleep(250);

            System.out.println("ENTER THE NUMBER : ");
            int a = x.nextInt();
            Thread.sleep(250);

            System.out.println("Checking...........");
            Thread.sleep(1000);

            if (a%5==0 && a%7==0)
            {
                System.out.println("The Number "+a+" is divisible by both 5 & 7");
            }

            if (a%5!=0 || a%7!=0)
            {
                System.out.println("The Number "+a+" is \"NOT\" divisible by both 5 & 7");
            }

       }


}
