import java.util.Scanner;

class project02
{

    static Scanner x = new Scanner(System.in);

    public static void main( String[] args)
    {
        boolean a = true;

        do {

            System.out.println("\t\t\t..Select Application..");
            System.out.println("1.Gmail\n2.Instagram\n3.Whatsapp\n4.Exit");
            int a1 = x.nextInt();

            switch (a1)
            {
                case 1 :
                {//gmail
                    boolean c = true;//exit from gmail page
                    do
                    {

                        System.out.println("\tGmail");
                        System.out.println("\t\tSelect The Input");
                        System.out.println("1.Inbox\n2.Spam\n3.Exit");
                        int a2 = x.nextInt();


                        switch (a2)
                        {//Inbox
                            case 1: {
                                System.out.println("You have selected Inbox");
                                break;
                            }
                            case 2: {
                                System.out.println("You have selected Spam");
                                break;
                            }
                            case 3: {
                                c = false;
                                break;
                            }
                            default: {
                                System.out.println("Invalid");
                                break;
                            }

                        }


                    }while (c);
                    break;//to come outside the gmail page
                }



                case 2 :
                {
                    boolean d = true;
                    do
                    {

                        System.out.println("\tInstagram");
                        System.out.println("\t\tSelect The Input");
                        System.out.println("1.Reels\n2.Profile\n3.Exit");
                        int a2 = x.nextInt();


                        switch (a2)
                        {
                            case 1: {
                                System.out.println("You have selected Reels");
                                break;
                            }
                            case 2: {
                                System.out.println("You have selected Profile");
                                break;
                            }
                            case 3: {
                                d = false;
                                break;
                            }
                            default: {
                                System.out.println("Invalid");
                                break;
                            }

                        }


                    }while (d);
                    break;//to come from insta
                }


                case 3 :
                {
                    boolean e = true;
                    do
                    {

                        System.out.println("\tWhatsapp");
                        System.out.println("\t\tSelect The Input");
                        System.out.println("1.Chats\n2.Status\n3.Exit");
                        int a2 = x.nextInt();


                        switch (a2)
                        {
                            case 1: {
                                System.out.println("You have selected Chats");
                                break;
                            }
                            case 2: {
                                System.out.println("You have selected Status");
                                break;
                            }
                            case 3: {
                                e = false;
                                break;
                            }
                            default: {
                                System.out.println("Invalid");
                                break;
                            }

                        }


                    }while (e);
                    break;
                }
                case 4 :{//Home page
                    a=false;
                    break;}



            }


        }while (a);


        System.out.println("Thank You*******");



    }




}
