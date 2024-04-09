import java.util.Scanner;

class numpalindrome
{
    static Scanner x = new Scanner(System.in);

       public static void main(String [] args)

       {
           System.out.println("ENTER THE NUMBER : ");
           int num = x.nextInt();

           int tempN = num;

           int rev = 0;


                     while (num>0)
                     {
                         rev = rev*10 + num%10;

                         num = num/10;


                     }

                     System.out.println("Given : " +tempN);

                     if (tempN == rev)
                     {
                         System.out.println("The Number "+ rev + " is Palindrome");

                     }
                     else
                     {
                         System.out.println("The Number "+ rev + " is NOT a Palindrome");
                     }




       }


}
