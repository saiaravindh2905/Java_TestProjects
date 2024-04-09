import java.util.Scanner;

class switch4
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tVOWEL or CONSONANT ");
        Thread.sleep(250);

        System.out.println("ENTER A CHARACTER : ");
        char vc =x.next().charAt(0);
        Thread.sleep(350);

        System.out.println("CHECKING.............");
        Thread.sleep(1500);

        switch (vc)
        {
            case 'a' : System.out.println("CHARACTER " +vc+" is a VOWEL");
                break;

            default:
                if(vc>='a' && vc<='z' || vc>='A' && vc<='Z' )
                {
                    System.out.println("CHARACTER " +vc+ " is a CONSONANT");
                }

                else
                {
                    System.out.println("INVALID");
                }

        }



    }

}

