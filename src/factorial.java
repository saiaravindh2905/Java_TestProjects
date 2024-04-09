import java.util.Scanner;

class factorial
{
    static Scanner x =new Scanner (System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the number : ");
        int num = x.nextInt();
        int sum = 1;

        for(int i = 1 ; i<=num ; i++)
        {
            sum = sum * i;
        }
        System.out.println(sum);



    }


}
