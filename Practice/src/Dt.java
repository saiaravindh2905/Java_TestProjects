import java.util.*;
class Dt
{
    public static void main(String[] args)
    {

         int [] a= {3,8,3,4,8,16};

         int count = 0;

         for(int i = 0 ; i<a.length ; i++)
         {
             for(int j =i+1; j<a.length ; j++)
             {
                 if(a[i]==a[j] && a[i]!=Integer.MIN_VALUE)
                 {
                     count++;
                     a[j]=Integer.MIN_VALUE;

                 }
             }


         }


         int [] b = new int[a.length-count];
         int c = 0;
         for(int i =0 ; i<a.length ; i++)
         {
             if(a[i]!=Integer.MIN_VALUE ) {
                 b[c++] = a[i];
             }

         }

        System.out.println(Arrays.toString(b));


    }



}
