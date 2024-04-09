import java.util.Scanner;
class Nameofweek
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\t**NAME OF THE WEEK**");
        Thread.sleep(500);

        System.out.println("ENTER A NUMBER FROM 1-7 : ");
        int button = x.nextInt();
        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (button==1)
        {
            System.out.println("SUNDAY");
        }

        if (button==2)
        {
            System.out.println("MONDAY");
        }

        if (button==3)
        {
            System.out.println("TUESDAY");
        }

        if (button==4)
        {
            System.out.println("WEDNESDAY");
        }

        if (button==5)
        {
            System.out.println("THURSDAY");
        }

        if (button==6)
        {
            System.out.println("FRIDAY");
        }

        if (button==7)
        {
            System.out.println("SATURDAY");
        }


        if (button<1 || button>7){

            System.out.println("---------INVALID----------");
        }

    }

}
