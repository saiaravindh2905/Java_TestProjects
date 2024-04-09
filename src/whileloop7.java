import java.util.Scanner;
class whileloop7
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)

    {
        System.out.println("ENTER THE NUMBER :  ");
        int num = x.nextInt();

           if (num>=0 && num<=9)
           {
               System.out.println("INVALID");
           }

           else
           {
               int last = num%10;

               while(num>   9)
               {
                   num/=10;

               }

               int total = num + last;

               System.out.println("First Number : " +num );
               System.out.println("Last Number :  " +last);
               System.out.println("SUM OF FIRST AND LAST NUMBER : " +total);

           }












    }



}
