import java.util.Scanner;

class dowhile01
{
    static Scanner x = new Scanner(System.in);

            public static void main( String[] args)
            {
                    boolean b = true;

                do {
                    System.out.println("\t\t\tSelect the Organisa");
                    System.out.println("1.QSPIDERS\n2.JSPIDERS\n3.PYSPIDERS\n4.Exit");
                    int a = x.nextInt();

                        switch (a)
                        {
                            case 1 : { System.out.println(" You have selected Qspiders **");
                                break;
                            }

                            case 2 : { System.out.println(" You have selected Jspiders **");
                                break;
                            }

                            case 3 : { System.out.println(" You have selected Pyspiders **");
                                break;
                            }

                            case 4 : { b=false;
                                System.out.println(" Exiting***");
                                break;
                            }

                            default: {
                                System.out.println("INVALID");
                            }



                        }


                }while(b);


                System.out.println("\t\t Thank you ");


            }


}
