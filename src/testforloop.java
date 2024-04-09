import java.util.Scanner;

class testforloop {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)throws Exception
    {
        int i;
        System.out.println("Enter The Number : ");
        int a = x.nextInt();
        int b = 1;
        int count1 = 0;


        for (i = 1; i<=10; i++)
        {
            b=a*i;


            System.out.println(a+" x "+i+ " = "  +b  );
            Thread.sleep(100);


        }


    }


}

