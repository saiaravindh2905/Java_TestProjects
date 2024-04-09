import java.util.*;
public class d
{
    static Scanner x = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception {

        long[]a = new long[x.nextInt()];
        long n1 = 0, n2 = 1, n3;
        for(int i = 0 ; i<a.length ; i++)
        {
            a[i]=x.nextLong();
        }




        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i]==1)
            {
                System.out.print(n1);
            }
            else if(a[i]==2)
            {
                System.out.print(n1+" "+n2+" ");
            }

            for(int j =2; j<a[i] ; j++)
            {
                n3 = n1+n2;

                if(n1==0 && n2==1 && j==2)
                {
                    System.out.print(n1+" "+n2+" ");
                }

                System.out.print(n3+" ");

                n1 = n2;
                n2 = n3;


            }

            System.out.println(" ");


        }


    }

}
