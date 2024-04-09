import java.util.Scanner;
import java.util.*;

public class sampletest
{
    static Scanner x = new Scanner(System.in);

    public static void main(String []args)throws Exception
    {

        boolean loop = true;
        do
        {

                System.out.println("Main Method");
                System.out.println("\n\tSelect the Function ");
                System.out.println("1.Binary to Decimal \n2.Decimal to Binary\n3.Exit");
                int mainkey = x.nextInt();



            switch (mainkey)
            {
                case 1: {
                    System.out.println("\n\tBinary to Decimal ");
                    System.out.println("Enter the Binary value : ");
                    Binary_to_Decimal(x.nextInt());
                    break;
                }

                case 2: {
                    System.out.println("\n\tDecimal to Binary ");
                    System.out.println("Enter the Decimal value : ");
                    Decimal_to_Binary(x.nextInt());
                    break;
                }

                case 3: {
                    loop=false;
                    break;
                }


            }

        } while (loop);


        System.out.println("Main Method Ended");

    }
    public static void Binary_to_Decimal(int binary)throws Exception
    {

        int sum = 0;
        int power = 1;
        int temp = binary;

        while (binary > 0)
        {
            sum = sum + binary % 10 * power;
            power = power * 2;
            binary = binary/10;

        }
        System.out.println("The Decimal of "+temp+" is "+sum);
        Thread.sleep(1500);
        System.out.println("\n\n exiting binary ro decimal method ****************\n");
        Thread.sleep(1500);

    }

    public static void Decimal_to_Binary(int decimal)throws Exception
    {
        int sum = 0;
        int power = 1;
        int temp = decimal;

        while (decimal > 0)
        {
            sum = sum + decimal % 2 * power;
            decimal = decimal/2;
            power = power * 10;


        }
        System.out.println("The Binary of "+temp+" is "+sum);
        Thread.sleep(1500);
        System.out.println("\n\n exiting decimal to binary method *****************\n");
        Thread.sleep(1500);



    }

}
