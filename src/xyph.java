import java.util.Scanner;

class xyph
{
    static Scanner x = new Scanner(System.in);

    public static void main( String [] args )
    {
        System.out.println("ENter the number : ");
        int num = x.nextInt();
        int temp = num;
        int mean = 0;



        if(num<=9)
        {
            System.out.println("Invalid");
        }

        else
        {
           int last = num%10;

           // for first and mean

           while(num>9)
           {
               mean = mean+num%10;
               num/=10;

           }

           mean = mean - last;
           int first = num;

            System.out.println("sum of first  and last : "+ (first+last));
            System.out.println("sum of the mean : "+mean);


            if((first+last)==mean)
            {
                System.out.println("The given number is xylem");

            }
            else
            {
                System.out.println("the given number is a phoelem");
            }



        }





    }

}
