import java.util.Scanner;
public class Numprog4
{ // find the factorial of a number by using method and take the input from the user
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the number : ");
        int a = x.nextInt();

        factorial(a);

    }

    public static void factorial(int b)
    {
        int add = 1;

         for(int i =1; i<=b ; i++)
         {
             add = add*i;

         }

        System.out.println("The factorial of given number is : "+add );

    }




}
