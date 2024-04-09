import java.util.Scanner;
// Strong number
// given number = 145 ====== factorial of each digit and the sum of all factorials (sum) ==== [sum == given number] - Strong number
class forloopStrongnumber
{   // Strong number = [ sum of the factorial of the digits == given number ]
    static Scanner x = new Scanner(System.in);

          public static void main(String [] args)
          {
              System.out.println("Enter The Number : ");
              int num = x.nextInt();
              int temp = num;
              int last = 0;
              int fact = 1;
              int sum =  0;

                  while (num > 0)
                  {
                      last = num%10;  // taking the last number form given number and store it in last container

                      for (int i = 2; i<=last; i++ ) // here the condition is - [ using the last number as limit ]- for factorial upto the last.
                      {
                          fact = fact * i;
                      }
                          sum +=fact; // sum = sum + fact
                          num/=10;    // removing last digit
                          fact = 1;  // reset thr value for fact
                  }

                  System.out.println((sum == temp)?"Strong":"Not Strong");
          }
}