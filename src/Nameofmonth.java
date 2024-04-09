import java.util.Scanner;
class Nameofmonth
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\t**NAME OF THE MONTH**");
        Thread.sleep(500);

        System.out.println("ENTER A NUMBER : ");
        int button = x.nextInt();
        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (button==1)
        {
            System.out.println("JANUARY");
        }

        if (button==2)
        {
            System.out.println("FEBRUARY");
        }

        if (button==3)
        {
            System.out.println("MARCH");
        }

        if (button==4)
        {
            System.out.println("APRIL");
        }

        if (button==5)
        {
            System.out.println("MAY");
        }

        if (button==6)
        {
            System.out.println("JUNE");
        }

        if (button==7)
        {
            System.out.println("JULY");
        }

        if (button==8)
        {
            System.out.println("AUGUST");
        }

        if (button==9)
        {
            System.out.println("SEPTEMBER");
        }

        if (button==10)
        {
            System.out.println("OCTOBER");
        }

        if (button==11)
        {
            System.out.println("NOVEMBER");
        }

        if (button==12)
        {
            System.out.println("DECEMBER");
        }

        if (button<1 || button>12){

            System.out.println("---------INVALID----------");
        }

    }

}
