import java.util.Scanner;

class Rectangle
{
    static Scanner x = new Scanner(System.in);


    public static void main(String[] args)
    {

        System.out.println("Enter the length : ");
        double l = x.nextDouble();

        System.out.println("Enter the Breadth : ");
        double b = x.nextDouble();


        System.out.println(calculate(l,b));



    }


    public static double calculate(double l,double b)
    {
        double res = (l*b);
        return res;

    }






}
