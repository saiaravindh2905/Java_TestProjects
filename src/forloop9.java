import java.util.Scanner;
// Minimum Digit in the giver number
class forloop9
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter The Number : ");
        int num = x.nextInt();
        int min  = num%10;

        for ( i=num; i>0; i/=10 )
        {
            if (i%10 < min)
            {
                min = i%10;
            }

        }


        System.out.println(min);


    }



    

}
