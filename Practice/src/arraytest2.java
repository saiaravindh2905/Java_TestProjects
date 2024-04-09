import java.util.Arrays;

public class arraytest2
{
    public static void main(String[] args)
    {
        /*   int [] a = {2,3,4,5};
           int [] res = new int[a.length];
           int sum = 0;

           for(int i = 0 ; i<res.length ;i++)
           {
               for (int j = 0; j <= i; j++)
               {
                   sum = sum + a[j];
               }
               res[i] = sum;
               sum = 0;
           }

           System.out.println(Arrays.toString(a));
           System.out.println(Arrays.toString(res));

 */




        int []a ={9,8,7,5,1,3,3,2,2,4,4,5,6,7,3,4,5,2,1};
        int []res=new int[a.length];
        int temp = 0;

        for(int i =0 ; i<a.length-1; i++)
        {
            for (int j = 0 ; j<a.length-1; j++)
            {
                  if(a[j]>a[j+1])
                  {
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;

                  }


            }


        }


        System.out.println(Arrays.toString(a));
        int j = 0;

        for(int i=0 ; i<a.length-1; i++)
        {
            if (a[i]!=a[i+1])
            {
                res[j]=a[i];
                j++;


            }


        }

        System.out.println(Arrays.toString(res));

       if(a[a.length-2]!=a[a.length-1])
       {
           res[j]=a[a.length-1];
           j++;
       }

        System.out.println(Arrays.toString(res));

        int []c=new int[j];
        for (int i = 0; i<j ; i++)
        {
            c[i]=res[i];
        }

        System.out.println(Arrays.toString(c));



    }
}
