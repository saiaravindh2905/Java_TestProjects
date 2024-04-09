import java.util.Scanner;
//Multiplication  Tables fot given numbers upto 10
class forloopprime
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)throws Exception
    {
        int i;
        System.out.println("Enter The Number : ");
        int a = x.nextInt();
        int b = 1;



        for (i = 1; i<=10; i++)
        {

            System.out.println(a+" x "+i+ " = " +a*i  );
            Thread.sleep(100);
        }


    }





}
