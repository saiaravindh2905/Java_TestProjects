import java.util.Scanner;

class digitalproduct
{
       static Scanner x =new Scanner(System.in);

         public static void main( String [] args)
         {
             System.out.println("ENTER THE NUMBER :  ");
             int num = x.nextInt();
             int pr = 1;

             while ( num > 0)
             {
                 pr*= num%10;
                 num/=10;
             }
             System.out.println("DIGITAL PRODUCT : " +pr);

         }

}
