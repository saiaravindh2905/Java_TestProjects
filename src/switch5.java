import java.util.Scanner;

public class switch5
{

    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tEVEN or ODD ");
        Thread.sleep(250);

        System.out.println("ENTER A NUMBER : ");
        int b1 = x.nextInt();
        Thread.sleep(350);

        System.out.println("CHECKING.............");
        Thread.sleep(1500);

        switch (b1%2)
        {
            case 0 : System.out.println("The Number " + " is EVEN");
                break;

            case 1 : System.out.println("The Number " + " is ODD");


        }



    }



}
