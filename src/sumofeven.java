import java.util.Scanner;

class sumofeven
{
    static Scanner x = new Scanner(System.in);

    public static void main (String [] args)
    {

        System.out.println("ENTER THE NUMBER :  ");
        int num = x.nextInt();

        int pr = 0;
        int re = 0;

        while ( num > 0)
        {
            pr = num%10;

            if (pr%2 == 0)
            {
                re=re+pr;
            }

            num/=10;

        }

          System.out.println("DIGITAL Sum Of Even Numbers : " +re);



    }


}
