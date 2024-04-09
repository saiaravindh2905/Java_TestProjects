import java.util.Scanner;
class Studentgrades
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {

        System.out.println("\t\t\tGrades Of Students");
        Thread.sleep(500);

        System.out.println("Subject 1 : ");
        double a = x.nextDouble();
        Thread.sleep(500);

        System.out.println("Subject 2 : ");
        double b = x.nextDouble();
        Thread.sleep(500);

        System.out.println("Subject 3 : ");
        double c = x.nextDouble();
        Thread.sleep(500);

        System.out.println("Subject 4 : ");
        double d = x.nextDouble();
        Thread.sleep(500);

        System.out.println("Subject 5 : ");
        double e = x.nextDouble();
        Thread.sleep(500);

        double f = a+b+c+d+e;

        System.out.println("Processing.......................");
        Thread.sleep(2000);

        System.out.println("Total marks : "+f);
        Thread.sleep(750);

        if(f>=450 && f<=500) {
            System.out.println("Grade A");
        }

        if (f>=400 && f<=449) {
            System.out.println("Grade B");
        }

        if (f>=350 && f<=399) {
            System.out.println("Grade c");
        }

        if (f>=300 && f<=349){
            System.out.println("Grade D");
        }

        if (f>=250 && f<=299){
            System.out.println("Grade E");
        }

        if (f>=0 && f<=249){
            System.out.println("Grade F");
        }

        if (f<0){
            System.out.println("INVALID");
        }


    }

}


