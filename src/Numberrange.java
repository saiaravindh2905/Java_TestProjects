import java.util.Scanner;
class Numberrange
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println("\t\t\tRANGE OF NUMBERS");

        System.out.println("Enter the number from (1 to 1000) = ");
        int a = x.nextInt();
        Thread.sleep(500);

        System.out.println("Processing.......................");
        Thread.sleep(2000);


            if (a > 0 && a <= 100) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 1 to 100 ");
            }

            if (a > 100 && a <= 200) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 101 to 200 ");
            }

            if (a > 200 && a <= 300) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 201 to 300 ");
            }

            if (a > 300 && a <= 400) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 301 to 400 ");
            }

            if (a > 400 && a <= 500) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 401 to 500 ");
            }

            if (a > 500 && a <= 600) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 501 to 600 ");
            }

            if (a > 600 && a <= 700) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 601 to 700 ");
            }

            if (a > 700 && a <= 800) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 701 to 800 ");
            }

            if (a > 800 && a <= 900) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 801 to 900 ");
            }

            if (a > 900 && a <= 1000) {
                System.out.println("THE NUMBER " + a + " IS BETWEEN 901 to 1000 ");
            }

        if (a<=0 || a>=1001)
        {

            System.out.println("THE ENTERED NUMBER IS NOT MATCHING WITH GIVEN RANGE");
        }




    }

}
