import java.util.Arrays;

class Arraystest3
{
    public static void main(String[] args)
    {
        int [] a = {5,3,0,2,1,0,3,6};
        // {0,0,5,3,2,1,3,6}
        int temp=0;
        int p=0;
        //task 1
        int [] res = new int [a.length];

      /*  for(int i=0 ; i<a.length; i++)
        {
            if(a[i]==0)
            {
                p++;
            }

        }


        for (int i = 0 ,j = 0; i<a.length; i++)
        {
            if( i!=(p-1) )
            { //int [] a = {5,3,0,2,1,0,3,6};

                if(a[j]!=0)
                {
                    r1[i]=a[j];
                    j++;
                }

                else if (a[i]==0)
                {
                    j++;
                    i--;
                }

            }

        } */

        for(int i = 0,k=0 ;i<a.length; i++)
        {
            // {5,3,0,2,1,0,3,6}
            // {0,0,5,3,2,1,3,6}

            if(a[i]==0)
            {
                res[k] = a[i];
                k++;

               if(i<a.length)
               {
                   k=k-1;

                       /* for (int j=0; j<a.length-1; j++)
                       {
                             if(a)

                       }
                       */


               }

            }



        }






        System.out.println(Arrays.toString(a));

    }


}
