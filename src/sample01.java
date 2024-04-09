import java.util.Arrays;
import java.util.Scanner;

public class sample01
{
    public static void main (String [] args)
    {
       int []a ={10,20,30,40};

       int first = a[0];

       System.out.println(first);
        System.out.println(a[a.length-1]);

       a[a.length-1]=first;

       System.out.println(a[a.length-1]);
       System.out.println(Arrays.toString(a));


    }

}
