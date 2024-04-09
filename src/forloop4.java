import java.util.Scanner;
class forloop4
{ static Scanner x = new Scanner (System.in);

       public static void main(String [] args)
       {  // Prime number
            int i;
            System.out.println("Enter The Number : ");
            int a = x.nextInt();
            int count1 = 0;


                for (i=1 ;i<=a ; i++)
                {
                    if (a%i == 0 )
                    {
                        System.out.println("It is divisible by "+i );
                        count1++;
                    }
                }

           if (count1 == 2)
           {
               System.out.println(" \nThe number " +a+ " is a prime number" );
           }
           else if (count1 == 1 || count1>=3)
           {
               System.out.println("\nThe number " +a+ " is a Composite number");
           }

           System.out.println("\n The Count is  "+count1);


       }

}
