import java.util.Scanner;
// fibonacci series in reverse w
class forloop8
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.println("Enter the 1st number : ");
        int n1= x.nextInt();

        System.out.println("Enter the 2nd number : ");
        int n2= x.nextInt();

        int n3=0; int sum=0;

        System.out.print(n1+ " "+n2+ " ");

        for (int i=1 ;n3>=0; i++)
        {
            n3 =  n1-n2;

            System.out.print(n3+ " ");

            n1 = n2;
            n2 = n3;
        }
        System.out.println("\nThe total sum of reverse Fibonacci numbers is :  " +sum);











    }




}
