import java.util.Arrays;

class arraystest
{

    public static void main(String[] args)
    {
        int [] a = {1,2,3,4};

        // int [] res = {1,3,6,10}

        int [] res = new int[a.length];
        System.out.println(Arrays.toString(res));

        int c =0; int sum = 0;

        for (int i = 0 ; i<res.length ; i++)
        {
            if(a[i]==1 || a[i]==0)
            {
                res[i]=a[i];
            }
            else if(a[i]>1)
            {
                c = a[i];

                for (int j = 0 ; c>0 ; j++ )
                {

                    sum = sum + c;
                    c--;
                }

               res[i]= sum;
                sum = 0;
                c=0;


            }




        }


        System.out.println("A : "+Arrays.toString(a));
        System.out.println("Res : "+Arrays.toString(res));




    }



}
