import java.util.Scanner;

public class Numprog1
{

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("ENter the num : ");
        int a = x.nextInt();

      int c =  countofDigit(a);

        System.out.println("The number "+a+" is having "+c+" Digits");




    }

    public static int countofDigit(int b)
    {

        int count = 0;


        while(b>0)
        {
            count++;
            b/=10;
        }

        return count;



    }


}
