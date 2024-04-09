import java.util.Scanner;
class switch3
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\tSELECT YOUR CHOICE");
        Thread.sleep(250);

        System.out.println("1.LARGEST OF TWO NUMBERS\n2.LARGEST OF THREE NUMBERS");
        int b1 = x.nextInt();
        Thread.sleep(250);

        switch (b1) {
            case 1: {
                System.out.println("\t\tENTER 1st VALUE :");
                int b2 = x.nextInt();
                Thread.sleep(150);

                System.out.println("\t\tENTER 2nd VALUE :");
                int b3 = x.nextInt();
                Thread.sleep(150);

                System.out.println("PROCESSING.........");
                Thread.sleep(1850);

                if (b2 > b3) {
                    System.out.println("THE LARGEST NUMBER IS " + b2);
                } else if (b3 > b2) {
                    System.out.println("THE LARGEST NUMBER IS " + b3);
                }

                break;
            }

            case 2: {
                System.out.println("\t\tENTER 1st VALUE :");
                int b4 = x.nextInt();
                Thread.sleep(150);

                System.out.println("\t\tENTER 2nd VALUE :");
                int b5 = x.nextInt();
                Thread.sleep(150);

                System.out.println("\t\tENTER 3nd VALUE :");
                int b6 = x.nextInt();
                Thread.sleep(150);

                System.out.println("PROCESSING.........");
                Thread.sleep(1850);

                if (b4 > b5 && b4 > b6) {
                    System.out.println("THE LARGEST NUMBER IS " + b4);
                } else if (b5 > b6) {
                    System.out.println("THE LARGEST NUMBER IS " + b5);
                } else if (b6 > b5 && b6 > b4) {
                    System.out.println("THE LARGEST NUMBER IS " + b6);
                }


            }


        }
    }
}