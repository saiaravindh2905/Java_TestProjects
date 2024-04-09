import java.util.Scanner;
class Remote5B
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\t**AIR CONDITIONER REMOTE**");
        Thread.sleep(500);

        System.out.println("1.POWER ON\n2.FAN MODE\n3.TEMP +\n4.TEMP -\n5.POWER OFF");
        Thread.sleep(500);
        System.out.println("\n\tSELECT A NUMBER : ");
        int button = x.nextInt();
        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (button==1)
        {
            System.out.println("POWER ON");
        }

        if (button==2)
        {
            System.out.println("FAN MODE");
        }

        if (button==3)
        {
            System.out.println("TEMP +");
        }

        if (button==4)
        {
            System.out.println("TEMP -");
        }

        if (button==5)
        {
            System.out.println("POWER OFF");
        }


        if (button<1 || button>5){

            System.out.println("---------INVALID----------");
        }

    }

}
