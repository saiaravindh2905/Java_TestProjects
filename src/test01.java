import java.util.Scanner;
class test01 {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        System.out.println("\t\t\tCALCULATOR");
        Thread.sleep(250);

        System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS ");
        Thread.sleep(300);

        System.out.println("\t\tSELECT YOUR CHOICE");
        int a = x.nextInt();
        Thread.sleep(250);

        switch (a)
        {
            case 1:
            {
                System.out.println("\t\t\t--ADDITION METHOD--\n\t\t\t--------------------");
                Thread.sleep(500);

                System.out.println("Enter 1st Value  :");
                int a1 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Enter 2nd Value  :");
                int a2 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Calculating*****");
                Thread.sleep(1500);

                System.out.println("THE VALUE IS " + (a1 + a2) );
                break;
            }

            case 2:
            {
                System.out.println("\t\t\t--SUBTRACTION METHOD--\n\t\t\t--------------------");
                Thread.sleep(500);

                System.out.println("Enter 1st Value  :");
                int a1 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Enter 2nd Value  :");
                int a2 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Calculating*****");
                Thread.sleep(1500);

                System.out.println("THE VALUE IS " + (a1 - a2) );
                break;
            }

            case 3:
            {
                System.out.println("\t\t\t--MULTIPLICATION METHOD--\n\t\t\t--------------------");
                Thread.sleep(500);

                System.out.println("Enter 1st Value  :");
                int a1 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Enter 2nd Value  :");
                int a2 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Calculating*****");
                Thread.sleep(1500);

                System.out.println("THE VALUE IS " + (a1 * a2) );
                break;
            }

            case 4:
            {
                System.out.println("\t\t\t--DIVISION METHOD--\n\t\t\t--------------------");
                Thread.sleep(500);

                System.out.println("Enter 1st Value  :");
                int a1 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Enter 2nd Value  :");
                int a2 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Calculating*****");
                Thread.sleep(1500);

                System.out.println("THE VALUE IS " + (a1 / a2) );
                break;
            }

            case 5:
            {
                System.out.println("\t\t\t--MODULUS METHOD--\n\t\t\t--------------------");
                Thread.sleep(500);

                System.out.println("Enter 1st Value  :");
                int a1 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Enter 2nd Value  :");
                int a2 = x.nextInt();
                Thread.sleep(250);

                System.out.println("Calculating*****");
                Thread.sleep(1500);

                System.out.println("THE VALUE IS " + (a1 % a2) );

            }

        }

    }

}