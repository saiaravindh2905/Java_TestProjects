import java.util.*;
class poweroperation
{
    static Scanner x = new Scanner (System.in);

    public static void main(String [] args)
    {
        System.out.println("Enter the number : ");
        int num = x.nextInt();
        System.out.println("Enter the power : ");
        int pow = x.nextInt();
        int res = 1;


        for (int i = 1 ; i<=pow ; i++ )
        {
            res = res * num;

        }

        System.out.println(res);





    }


}
