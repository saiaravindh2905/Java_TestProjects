import java.util.Scanner;
class Agegroup
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {

        System.out.println("\t\t\t--Age Group Identifier--");
        Thread.sleep(500);

        System.out.println("Enter The Age : ");
        int a = x.nextInt();
        Thread.sleep(500);


        System.out.println("Processing.......................");
        Thread.sleep(2000);

        if(a>55 && a<125) {
            System.out.println("SENIOR");
        }

        if (a>=20 && a<=54) {
            System.out.println("ADULT");
        }

        if (a>=13 && a<=19) {
            System.out.println("TEENAGER");
        }

        if (a>=4 && a<=12){
            System.out.println("CHILD");
        }

        if (a>=1 && a<=3){
            System.out.println("INFANT");
        }

        if (a<0){
            System.out.println("INVALID");
        }


    }

}
