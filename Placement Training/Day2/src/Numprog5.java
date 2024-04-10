import java.util.Scanner;

public class Numprog5
{ // Spy number
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the Number : ");
        int a = x.nextInt();
        spy(a);
    }
    public static void spy(int b)
    {
        int sum =0,prod =1,last;
        while( b > 0)
        {
            last = b%10;
            sum = sum + last;
            prod = prod * last;
            b/=10;
        }
        if(sum==prod)
        {
            System.out.println("It is a spy number");
        }
        else {
            System.out.println("It is not a spy number");
        }
    }
}
