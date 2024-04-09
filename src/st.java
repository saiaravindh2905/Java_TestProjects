import java.util.Scanner;

public class st {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the integer value : ");
        int integer = x.nextInt();
        System.out.println("Enter the power value : ");
        int power = x.nextInt();
        int result = 1 ;

        for(int i = 1 ; i<=power ; i++)
        {
            result = result*integer;

        }

        System.out.println(result);



    }




}
