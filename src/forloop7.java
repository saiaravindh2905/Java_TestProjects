import java.util.Scanner;

class forloop7
    //Fibonacci Series
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        long n1=0 , n2=1 , n3=0;
        System.out.println("Enter the max count of numbers : ");
        long max = x.nextInt();
        max-=2;

        System.out.print(n1+ " "+n2+ " ");

        long sum=0;

        for (long i=1 ; i<=max ; i++)
        {
            n3 =  n1+n2;
            sum = sum+n3;

            System.out.print(n3+ " ");

            n1 = n2;
            n2 = n3;

        }

        System.out.println("\nFibonacci Sum is : "+sum);


    }


}
