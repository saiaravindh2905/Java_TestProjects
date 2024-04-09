import java.util.Scanner;
// Max Digit in the given number
class forloop5
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter The Number : ");
        int num = x.nextInt();
        int max  = num%10;

           for ( i=num; i>0; i/=10 )
           {
               if (i%10 > max)
               {
                   max = i%10;
               }

           }

           System.out.println(max);
    }

}
