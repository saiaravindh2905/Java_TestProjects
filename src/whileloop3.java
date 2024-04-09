import java.util.Scanner;
class whileloop3
{
    static Scanner x = new Scanner(System.in);

       public static void main(String [] args)

          {
                System.out.println("Enter the number : ");
                int num = x.nextInt();

                int tempn = num;
                int count = 0;

                if ( num == 0)
                {
                    System.out.println("INVALID");
                }

                else
                {
                    while ( num> 0)
                    {
                        num/=10;
                        count++;

                    }

                   System.out.println("Given Number is : " + tempn);
                   System.out.println("THE COUNT OF NUMBER : "+ count);


                }




          }


}
