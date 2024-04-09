import java.util.Arrays;
import java.util.Scanner;

class T4
{
     static Scanner x = new Scanner(System.in);

       public static void main(String [] args)throws Exception
       {
           System.out.println(" Enter the length of array : ");
           int [] a = new int[x.nextInt()];
           System.out.println("a = "+ Arrays.toString(a) );
           int last = 0;

           for (int i = 0 ; i<a.length; i++ )
           {
               System.out.println("Enter the index of "+i+" :");
               a[i]=x.nextInt();

           }

           System.out.println("a = "+ Arrays.toString(a) );
           Thread.sleep(1050);
           int [] t = a;
           int b;
           int [] reverse = new int[a.length];

           for( int i = a.length-1 ; i>0 ;i--)
           {

               b = a[i]%10;
               System.out.println("b : "+b);

               do {

                   reverse[i] = reverse[i] * 10 + b;
                   System.out.println("rev : " + Arrays.toString(reverse));

               }while (reverse[i]!=t[i]);


               a[i]/=10;
               System.out.println("Remove last : "+Arrays.toString(a));
           }



       }













}