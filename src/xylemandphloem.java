import java.util.Scanner;
class xylemandphloem
{
    static Scanner x = new Scanner(System.in);

         public static void main( String [] args )
         {
             System.out.println("Enter The Numbers : ");
             int num = x.nextInt();
             int temp = num;
             int last = 0;
             int mean = 0;

             last = num%10; // to select and store the last number.

             if ( num <=9) // to validate the user entered number ( if the number is single digit - it will show INVALID )
             {
                 System.out.println("INVALID");
             }

             else
             {

                 while (num > 9)
                 {                              // While Condition - It will work until the number goes to  single digit
                     mean = mean + num % 10;   // mean + last digit
                     num /= 10;               // removing last digit
                 }

                 mean = mean - last;    //it is used to remove the last digit from the sum(mean)
                 // ( num stores first digit ) & ( last stores the last digit ) & ( mean stores sum of mean digits )


                 System.out.println("Sum of First and Last numbers : " + (num + last));
                 System.out.println("Sum of Mean numbers : " + mean);

                 if ((num + last) == mean) {
                     System.out.println("\t\tThe Given Number " + temp + " is XYLEM");
                 } else {
                     System.out.println("\t\tThe Given Number " + temp + " is NOT XYLEM");
                 }


             }



         }



}
