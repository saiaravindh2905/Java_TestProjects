import java.util.Scanner;

class maxd
{
    static Scanner x =new Scanner (System.in);
    public static void main(String [] args) {
        System.out.println("Enter the number : ");
        int num = x.nextInt();
        int max = num%10;

        for(int i = num ; i>0 ; i/=10)
        {
            if(i%10>max)
                max = i%10;

        }


        System.out.println(max);


    }



}
