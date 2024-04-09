import java.util.Scanner;
class whileloop5
{
    static Scanner x = new Scanner(System.in);

         public static void main(String [] args)

         {

             System.out.println("ENTER THE NUMBER :  ");
             int num = x.nextInt();

             int sum = 0;

                     while ( num > 0)
                     {
                         sum+=num%10;

                         num/=10;

                     }

                  System.out.println("DIGITAL SUM : " +sum);









         }



}
