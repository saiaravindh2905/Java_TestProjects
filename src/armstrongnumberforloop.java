import java.util.Scanner;
// armstrong number **
class armstrongnumberforloop
{   //
    static Scanner x =new Scanner(System.in);

            public static void main(String [] args)
            {  //Armstrong number == [ sum of the cubes of their digits == given number ]

                System.out.println("Enter the number : ");
                int num = x.nextInt();
                int count = 0, last =0, product = 1, sum = 0, temp = num;

               //count
                while (num>0)
                {
                    num = num/10;
                    count++;
                }
                num = temp; //restoring the number value from temp

                while (num>0)
                {
                    last = num%10; // using only the last number

                  for (int i = 1; i<=count; i++) // here the condition is - [ using the count as limit ]
                  {
                      product = product*last;

                  }
                    sum = sum+product; // adding the product
                    num = num/10; // removing the last digit
                    product = 1; // changing the product number to 1
                }

                String result =  (sum == temp)?"Armstrong number": "Not Armstrong number";
                System.out.println(result);

            }



}
