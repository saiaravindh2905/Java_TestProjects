import java.util.Scanner;
class new01
{
    static Scanner x = new Scanner(System.in);

         public static void main(String [] args)throws  Exception
         {
             System.out.println("\t\t\tDRIVER INSURANCE ");
             Thread.sleep(500);

             System.out.println("\tMARITAL STATUS ");
             System.out.println("-------------------------------");
             System.out.println("M = MARRIED\nU = UNMARRIED");
             char a = x.next().charAt(0);
             Thread.sleep(500);

             System.out.println("Processing...........");
             Thread.sleep(2000);

             if (a == 'M' || a == 'm')
             {
                 System.out.println("* * YOU ARE ELIGIBLE FOR INSURANCE * *");
             }

             else if (a == 'U' || a == 'u')
             {

                 System.out.println("ENTER THE GENDER (M/F): ");
                 char b = x.next().charAt(0);
                 Thread.sleep(250);

                 System.out.println("ENTER THE AGE : ");
                 int c = x.nextInt();
                 Thread.sleep(250);

                     if ( b=='m' && (c>30 && c<65) || b =='M' && (c>30 && c<65) || b =='f' && (c>25 && c<60) || b =='F' && (c>25 && c<60) )
                     {
                         System.out.println("* * YOU ARE ELIGIBLE FOR INSURANCE * *");
                     }
                     else if (b=='m' && (c<=30) || b =='M' && (c<=30 ) || b =='f' && (c<=25 ) || b =='F' && (c<=25 ) )
                     {
                         System.out.println(" YOU ARE \"NOT\" ELIGIBLE FOR INSURANCE ");
                     }
                     else if ( b=='m' && (c>65) || b =='M' && (c>65) || b =='f' && (c>60) || b =='F' && (c>60) )
                     {
                         System.out.println(" YOU ARE \"NOT\" ELIGIBLE FOR INSURANCE ");
                     }


             }

             else
             {
                System.out.println("INVALID");
             }


         }



}
