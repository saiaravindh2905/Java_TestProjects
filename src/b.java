import java.util.Arrays;
import java.util.Scanner;

class b
{
    static Scanner x = new Scanner(System.in);

            public static void main(String [] args)
            {
                int num = x.nextInt();
                int last = 0;
                String result="Not a Duck Number";

                while(num>0)
                {
                    last = num%10;
                    if(last==0)
                    {
                        result= "Duck Number";
                        break;
                    }
                    num/=10;

                }


                System.out.println(result);

            }



}
