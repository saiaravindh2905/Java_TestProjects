import java.util.Scanner;
class T3
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\t CHECK..");
        Thread.sleep(250);

        System.out.println("ENTER THE First NUMBER : ");
        int a = x.nextInt();
        Thread.sleep(250);

        System.out.println("ENTER THE Second NUMBER : ");
        int b = x.nextInt();
        Thread.sleep(250);

        System.out.println("Checking...........");
        Thread.sleep(1000);

       if ( a == b)
       {
           System.out.println("PLUTO");

       }
       else
       {
           if (a>b)
           {
               if (a%3==0 && a%9==0)
               {
                   System.out.println("MARS");
               }
               else
               {
                   System.out.println("EARTH");
               }

           }

           if (a<b)
           {
               if (a%3==0 && a%9==0)
               {
                   System.out.println("JUPITER");
               }
               else
               {
                   System.out.println("FAZIL");
               }

           }



       }




    }


}