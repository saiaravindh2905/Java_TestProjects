import java.util.Scanner;

class forloop3
{
    static Scanner x = new Scanner(System.in);

        public static void main(String [] args)
       {
             int i ;
             System.out.println("Enter a number : ");
             int a = x.nextInt();
             int count = 0;

            for ( i = 1 ; i<=a ; i++)
            {
                if (a%i == 0)
                {
                    count++;
                   System.out.println("It is Divisible by "+i);
                }

            }


            System.out.println("The Count of  " + a + " is divisible by "+ count +" numbers.");





       }




}
