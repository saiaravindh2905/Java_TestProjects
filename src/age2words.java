import java.util.Scanner;
class age2words
{
    static Scanner x = new Scanner(System.in);

      public static void main(String [] args)throws Exception
      {
          System.out.println("\t\t\t\t***AGE IN WORDS***");
          Thread.sleep(250);

          System.out.println("ENTER THE AGE : ");
          int a = x.nextInt();
          Thread.sleep(500);

          System.out.println("Processing............");
          Thread.sleep(2450);

          if (a==11)
          {
              System.out.println("ELEVEN YEARS OLD");
          }

          if (a==12)
          {
              System.out.println("TWELVE YEARS OLD");
          }

          if (a==13)
          {
              System.out.println("THIRTEEN YEARS OLD");
          }
          if (a<11 || a>13)
          {
              System.out.println("DATA NOT FOUND");
          }




      }




}