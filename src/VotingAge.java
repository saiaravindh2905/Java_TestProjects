import java.util.Scanner;
class VotingAge {
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tVOTING ELIGIBILITY");
        System.out.println("Enter The Age ");

        int button = x.nextInt();
        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if (button>=18 && button<=115)
        {
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }

        if (button<18 && button>0)
        {
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
        }

        if (button<1 || button>115)
        {
            System.out.println("Invalid");
        }

    }

}









