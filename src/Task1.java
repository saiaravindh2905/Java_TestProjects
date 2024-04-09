import java.util.Scanner;
class Task1
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("ENTER THE NUMBER : ");
        int num = x.nextInt();

        System.out.println("Processing......");
        Thread.sleep(1000);

        if (num==0)
        {
            System.out.println("MATHS");
        }

        else
        {
            if (num%2==0)
            {
                System.out.println("SCIENCE");

            }
            else {
                System.out.println("SOCIAL");
            }


        }



    }

}
