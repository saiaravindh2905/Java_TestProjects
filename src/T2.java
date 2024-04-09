import java.util.Scanner;
class T2
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\t CHECK DIVISIBILITY OF BOTH 2 & 6");
        Thread.sleep(250);

        System.out.println("ENTER THE NUMBER : ");
        int a = x.nextInt();
        Thread.sleep(250);

        System.out.println("Checking...........");
        Thread.sleep(1000);

        if (a == 0)
        {
            System.out.println("JSP");

        }

        else
        {
            if (a%2 == 0 && a%6 == 0)
            {
                System.out.println("JAVA");

            }
            else
            {
                System.out.println("JDBC");
            }




        }





    }


}