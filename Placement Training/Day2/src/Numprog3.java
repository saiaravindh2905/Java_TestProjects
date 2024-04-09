import java.util.Scanner;

public class Numprog3
{  // print and count the factors of given number

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        int a = x.nextInt();

        factors(a);


    }


    public static void factors(int b)
    {
        int count=0;

        for(int i = 1 ; i<=b ; i++)
        {
            if(b%i==0)
            {
                System.out.print(i+",");
                count++;
            }


        }
        System.out.println(" ");
        System.out.println("the count of the Factors of the given number is "+count);

    }




}
