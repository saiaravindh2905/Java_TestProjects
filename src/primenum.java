import java.util.Scanner;
class primenum
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.println("First num : ");
        int first = x.nextInt();
        System.out.println("Last num :");
        int last = x.nextInt();

        int count = 0;
        System.out.println(" \n");


        while(first<=last)
        {
            for(int i = 1; i<=first ; i++)
            {
              if(first%i==0)
              {
                  count++;
              }

            }

            if(count==2)
            {
                System.out.print(first+",");
            }

            count=0;
            first++;

        }



    }



}
