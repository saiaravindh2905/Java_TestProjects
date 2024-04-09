import java.util.Scanner;
class VowelCheck
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tVOWEL OR CONSONANT");
        System.out.println("INPUT AN ALPHABET");

        Thread.sleep(500);

        char button = x.next().charAt(0);
        System.out.println("Processing.......................");
        Thread.sleep(2000);
         int b = 5;
        if ((button>='a' && button<='z') || (button>='A' && button<='Z')) {

            if (button == 'a' || button == 'e' || button == 'i' || button == 'o' || button == 'u' || button == 'A' || button == 'E' || button == 'I' || button == 'O' || button == 'U')
            {
                System.out.println(" The Alphabet " + button + " is a VOWEL");

            }

            if (b==5){
                System.out.println("The Alphabet " + button + " is a CONSONANT");
            }


        }

    }

}

