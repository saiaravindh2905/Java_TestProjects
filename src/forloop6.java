import java.util.Scanner;
// PERFECT number
class   forloop6
{
    static Scanner x = new Scanner (System.in);

    public static void main(String [] args)
    {
        int i;
        System.out.println("Enter The Number : ");
        int a = x.nextInt();
        int num = a;

        int p =0;

        for (i=1 ;i<a ; i++)
        {
            if (a%i == 0 )
            {
                System.out.println("It is divisible by "+i );
                p=p+i;
            }
        }
        if(p==num)
            System.out.println("\nThe Number "+num+" is a Perfect Number");
        else
            System.out.println("\nThe Number "+num+" is NOT a Perfect Number");

    }
}
