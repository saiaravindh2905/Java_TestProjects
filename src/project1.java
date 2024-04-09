import java.util.Scanner;
class project1
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t\t\t......WELCOME TO SWIGGY...!\n");
        Thread.sleep(250);

        System.out.println("\t\tSELECT THE HOTELS");
        Thread.sleep(250);
        System.out.println("1.SS HYDREBAD\n2.BUHARI\n3.A2B\n4.AMMA CANTEEN");
        int a1 = x.nextInt();
        Thread.sleep(300);

        switch (a1) {
            case 1: {
                System.out.println("\t\t** THANK YOU FOR SELECTING SS HYDREBAD ** \n");
                Thread.sleep(200);
                System.out.println("---SELECT THE FOOD---\n");
                System.out.println("1.MUTTON BRIYANI - Rs: 380 - \n2.CHICKEN BRIYANI - Rs: 250 - ");
                int MoC = x.nextInt();
                Thread.sleep(100);

                System.out.println("Processing...");
                Thread.sleep(500);


                if (MoC == 1) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 380; //mutton briyani


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....\n");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***\n");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println("Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***  Not Matching *** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }


                } else if (MoC == 2) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 250; //chicken briyani


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println("Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" *** Not Matching *** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }

                } else {
                    System.out.println("INVALID SELECTED NUMBER");
                }


                break;
            }

            case 2: {
                System.out.println("\t\t** THANK YOU FOR SELECTING BUHARI **\n");
                Thread.sleep(200);
                System.out.println("---SELECT THE FOOD---\n");
                System.out.println("1.GRILL CHICKEN  - Rs: 450 - \n2.TANDOORI - Rs: 500 - \n");
                int GOT = x.nextInt();
                Thread.sleep(100);

                System.out.println("Processing...\n");
                Thread.sleep(500);


                if (GOT == 1) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 450; //grill chicken


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....\n");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**\n");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP\n");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------\n");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println("Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }

                } else if (GOT == 2) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 500; //Tandoori


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println(" ***** Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }

                } else {
                    System.out.println("INVALID SELECTED NUMBER");
                }


                break;
            }

            case 3: {
                System.out.println("\t\t** THANK YOU FOR SELECTING A2B **");
                Thread.sleep(200);
                System.out.println("---SELECT THE FOOD---\n");
                System.out.println("1.POORI - Rs: 120 - \n2.PONGAL - Rs: 145 - ");
                int POP = x.nextInt();
                Thread.sleep(100);

                System.out.println("Processing...");
                Thread.sleep(500);


                if (POP == 1) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 120; //poori


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }


                } else if (POP == 2) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 145; //pongal


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println("Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }

                } else {
                    System.out.println("INVALID SELECTED NUMBER");
                }

                break;
            }


            case 4: {
                System.out.println("\t\t** THANK YOU FOR SELECTING AMMA CANTEEN **");
                Thread.sleep(200);
                System.out.println("---SELECT THE FOOD---\n");
                System.out.println("1.IDLI - Rs: 2 - \n2.DOSA - Rs: 5 - ");
                int IOD = x.nextInt();
                Thread.sleep(100);

                System.out.println("Processing...");
                Thread.sleep(500);


                if (IOD == 1) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 2; //idli


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }


                } else if (IOD == 2) {
                    System.out.println("\tSELECT THE QUANTITY : ");
                    int q1 = x.nextInt();
                    Thread.sleep(250);
                    double tb = q1 * 5; //dosa


                    System.out.println(" \tTOTAL BILL : " + tb);
                    Thread.sleep(200);
                    System.out.println("\nProcessing.....");
                    Thread.sleep(200);

                    System.out.println("SELECT THE PAYMENT METHOD \n");
                    System.out.println("1.GPay \n2.Phonepay ");
                    int upi = x.nextInt();
                    Thread.sleep(200);

                    System.out.println("Redirecting...***");
                    Thread.sleep(500);

                    switch (upi) {
                        case 1: {
                            System.out.println("\t\t...Google Pay...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }

                            break;
                        }


                        case 2: {

                            System.out.println("\t\t...PhonePe...\n");

                            System.out.println("ENTER THE TOTAL BILL AMOUNT :  " + tb);
                            double utba = x.nextInt();
                            System.out.println("Checking**");
                            Thread.sleep(1500);

                            if (utba == tb) {

                                System.out.println(" MATCHING----- Generating OTP ");
                                int otp = (int) (Math.random() * 999 * 999);
                                System.out.println(otp);

                                System.out.println("\tEnter the OTP");
                                int uotp = x.nextInt();
                                System.out.println(" Verifying ---------");
                                Thread.sleep(1500);

                                if (uotp == otp) {
                                    System.out.println(" \n** ORDER SUCCESSFUL **");
                                } else {
                                    System.out.println(" -- Order Failed -- ");
                                }

                            } else {
                                System.out.println(" ***Not Matching*** ");
                                Thread.sleep(500);
                                System.out.println("***** Payment Failed  *****");
                            }


                            break;
                        }

                        default: {
                            System.out.println("INVALID KEY");
                            break;
                        }

                    }

                } else {
                    System.out.println("INVALID SELECTED NUMBER");
                }

                break;
            }


            default: {
                System.out.println(" INVALID HOTEL SELECTION ");
                break;
            }

        }

    }



}
