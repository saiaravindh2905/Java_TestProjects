import java.util.Scanner;

class decimaltobinary
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a Decimal number : ");
        int decimal = x.nextInt();
        int pow = 1;
        int sum = 0;

        while (decimal > 0)
        {

            sum = sum + decimal % 2 * pow;

            decimal = decimal / 2 ;

            pow = pow * 10;

        }

        System.out.println(sum);

    }

}
