import java.util.Scanner;
class Char2ASCII
{
    static Scanner x = new Scanner(System.in);

        public static void main(String [] args)throws Exception
        {
            System.out.println("***CHARACTER TO ASCII VALUES***");
            Thread.sleep(250);

            System.out.println("ENTER A CHARACTER :  ");
            char a = x.next().charAt(0);

            System.out.println("Identifying..............");
            Thread.sleep(2000);

            int b =(int)a;

            if(b>=32 && b<=127)
            {
                 System.out.println("The ASCII value of entered Character " +a+ " is " +b);
            }

            if (b<32 || b>127)
            {
                System.out.println("DATA NOT FOUND");
            }


        }

}
