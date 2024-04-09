import java.util.Scanner;
// Entering the first and last number and finding out the prime numbers in between them.
class primenumber
{
  static Scanner x = new Scanner(System.in);

        public static void main(String [] args)
        {

                System.out.println("Enter the First number :  ");
                int first = x.nextInt();
                int temp = first;

                System.out.println("Enter the last number : ");
                int last = x.nextInt();
                int count =0,counteven =0,countodd =0;
                int sum = 0;


                while (first<=last)
                {
                    for (int i = 1; i<=first; i++)
                    {
                      if (first%i==0)
                      {
                          count++;
                      }

                    }

                    if(count==2)
                    {
                        sum = sum +  first;
                        System.out.print(first+" , ");

                        if (first%2==0)
                            counteven++;

                        else
                            countodd++;

                    }
                    count=0;
                    first++;
                }


             System.out.println("\n\n The sum of all the prime numbers present in between the given numbers "+temp+" is :  "+sum);
             System.out.println(" The Count of even prime numbers are :  "+counteven+ "\n The count of odd prime numbers are : "+countodd);




        }




}
