import java.util.Arrays;

class for_each_loop
{
    public static void main(String [] args)
    {

        int [] a = {5,10,15,20,25,30};
        System.out.println("\n\n int []a = "+ Arrays.toString(a)+"\n");


        for(int i : a)
        {
            System.out.println(i);
        }

        System.out.println("****************************************");

        String []b = {"Ram","Sita","Ravan","Lakshman","Hanuman"};
        System.out.println(" String []b = "+ Arrays.toString(b)+"\n");

        for(String j : b)
        {
            System.out.println(j);
        }

        System.out.println("\n*************************");

        System.out.println(" String []b = "+ Arrays.toString(b)+"\n");

        for(String res : b)
        {
            if(res.equals("Sita")) // .equals()
            {
                res = "Sheela";
            }

            System.out.println(res);

        }


    }


}
