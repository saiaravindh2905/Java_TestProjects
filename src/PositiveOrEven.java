import java.util.Scanner;
class PositiveOrEven
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {

        System.out.println("Enter a number ");
        Thread.sleep(500);

        int button = x.nextInt();
        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (button>=0 && button%2==0)
        {
            System.out.println(" It is \"Positive\" and \"Even\"");
        }

        if (button>0 && button%2!=0)
        {
            System.out.println("It is \"Positive\" but Not EVEN--->(ODD)");
        }

        if (button<=-1 && button%2==0)
        {
            System.out.println("It is \"Negative\" and \"Even\"");
        }

        if (button<=-1 && button%2!=0)
        {
            System.out.println("It is \"Negative\" but Not EVEN--->(ODD)");
        }

    }

}
