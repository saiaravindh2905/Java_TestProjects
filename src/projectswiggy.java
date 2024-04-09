import java.util.*;
class projectswiggy
{
    static Scanner x  = new Scanner (System.in);

    public static void main( String [] args)throws Exception
    {
        boolean e = true;
        do
      {
        System.out.println("\t\t\t**  Welcome to Swiggy  ** ");
        Thread.sleep(250);
        System.out.println(" \t - SELECT THE HOTEL -");
        Thread.sleep(250);
        System.out.println("1.MADRAS BRIYANI\n2.AKR MESS\n3.OLYMPIC MESS\n4.BUHARI\n5.EXIT");
        Thread.sleep(250);
        int hotel = x.nextInt();


        switch (hotel)
        {

            case 1:
            {
                boolean h = true;

                do
                {

                    System.out.println("THANKING YOU FOR SELECTING MADRAS BRIYANI\n\t\t\t -- MADRAS BRIYANI -- ");
                    Thread.sleep(250);

                    System.out.println("FOOD MENU");
                    System.out.println("1.Grill Chicken  - 200\n2.Chicken Noodles  -120\n3.Exit");
                    int htMB = x.nextInt();
                    Thread.sleep(250);

                    if(htMB == 1)
                    {
                        System.out.println("Enter the Quantity : ");
                        int qty = x.nextInt();
                        double total = qty*200;

                        System.out.println("\t\tMode Of Payment--");
                        Thread.sleep(250);
                        System.out.println("1.Google Pay \n2.Paytm");
                        int upi = x.nextInt();
                        Thread.sleep(250);

                        switch (upi)
                        {
                            case 1 :
                            {
                                System.out.println("\t\t** Google Pay **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                            Thread.sleep(1000);
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\t\t** Paytm **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                            Thread.sleep(1000);
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Order failed");
                                }
                                break;
                            }

                        }

                    }
                    else if (htMB == 2)
                    {
                        System.out.println("Enter the Quantity : ");
                        int qty = x.nextInt();
                        double total = qty*120;

                        System.out.println("\t\tMode Of Payment--");
                        Thread.sleep(250);
                        System.out.println("1.Google Pay \n2.Paytm");
                        int upi = x.nextInt();
                        Thread.sleep(250);

                        switch (upi)
                        {
                            case 1 :
                            {
                                System.out.println("\t\t** Google Pay **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                            Thread.sleep(1000);
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\t\t** Paytm **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                            Thread.sleep(1000);
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1500);
                                }
                                break;
                            }

                        }

                    }
                    else if (htMB == 3)
                    {
                        h=false;
                        System.out.println("Thank You Visit Again...");
                        Thread.sleep(1000);

                    }
                    else
                    {
                        System.out.println("Invalid number");
                        Thread.sleep(1000);
                    }

                }while (h);

                break;

            }

            case 2:{


                boolean h = true;

                do
                {

                    System.out.println("THANKING YOU FOR SELECTING AKR MESS ..\n\t\t\t -- AKR MESS -- ");
                    Thread.sleep(250);

                    System.out.println("FOOD MENU");
                    System.out.println("1.PAROTTA  - 20\n2. EGG RICE  -95\n3.Exit");
                    int htMB = x.nextInt();
                    Thread.sleep(250);

                    if(htMB == 1)
                    {
                        System.out.println("Enter the Quantity : ");
                        int qty = x.nextInt();
                        double total = qty*15;

                        System.out.println("\t\tMode Of Payment--");
                        Thread.sleep(250);
                        System.out.println("1.Google Pay \n2.Paytm");
                        int upi = x.nextInt();
                        Thread.sleep(250);

                        switch (upi)
                        {
                            case 1 :
                            {
                                System.out.println("\t\t** Google Pay **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\t\t** Paytm **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }

                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                        }

                    }
                    else if (htMB == 2)
                    {
                        System.out.println("Enter the Quantity : ");
                        int qty = x.nextInt();
                        double total = qty*120;

                        System.out.println("\t\tMode Of Payment--");
                        Thread.sleep(250);
                        System.out.println("1.Google Pay \n2.Paytm");
                        int upi = x.nextInt();
                        Thread.sleep(250);

                        switch (upi)
                        {
                            case 1 :
                            {
                                System.out.println("\t\t** Google Pay **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("Order failed");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\t\t** Paytm **");
                                System.out.println("Total Amount = "+total);
                                Thread.sleep(500);
                                System.out.println("ENTER THE AMOUNT TO BE PAID :");
                                double utotal = x.nextDouble();
                                Thread.sleep(500);
                                System.out.println("processing...........");
                                Thread.sleep(1000);

                                if (utotal == total)
                                {
                                    int i;

                                    for( i = 1 ; i<=5 ; i++)
                                    {

                                        System.out.println("Generating otp .....");
                                        int otp = (int) (Math.random()* 99*99);
                                        Thread.sleep(250);

                                        System.out.println(otp);
                                        System.out.println("\tEnter the otp : ");
                                        int uotp = x.nextInt();
                                        Thread.sleep(250);

                                        if(uotp == otp)
                                        {
                                            System.out.println("Order Successful");
                                            i=6;
                                        }
                                        else
                                        {
                                            System.out.println("otp Mismatch\n Try Again ");
                                            if(i==1) {
                                                System.out.println("4 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==2) {
                                                System.out.println("3 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==3) {
                                                System.out.println("2 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==4) {
                                                System.out.println("1 times left..");
                                                Thread.sleep(1000);
                                            }
                                            if (i==5) {
                                                System.out.println("Order Failed");
                                                Thread.sleep(1500);
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("\tOrder failed\n\n\n");
                                    Thread.sleep(1000);
                                }
                                break;
                            }

                        }

                    }
                    else if (htMB == 3)
                    {
                        h=false;
                        System.out.println("\tThank You Visit Again...");
                        Thread.sleep(1000);

                    }
                    else
                    {
                        System.out.println("Invalid number");
                        Thread.sleep(500);
                    }

                }while (h);





                break;}
            case 3:{break;}
            case 4:{break;}
            case 5:{ e=false;
                System.out.println(" Thankyou Visit again ");
                break;}

            default:
                break;
        }

      }while (e);


    }
}