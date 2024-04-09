import java.util.Scanner;

class switch6
 {
    static Scanner x = new Scanner(System.in);

          public static void main(String [] args)

          {
              System.out.println("\t\t\tSELECT THE INPUT");
              System.out.println("1.MATHS\n2.SCIENCE");
              int a = x.nextInt();

              switch (a)
              {
                  case 1:
                  {  System.out.println("\t\t\tSELECT THE INPUT");
                             System.out.println("1.10th STD \n2.12th STD");
                               int a1 = x.nextInt();

                               switch (a1)
                               {
                                   case 1 : {
                                       System.out.println("DINGA is 10th STD MATHS TEACHER ");
                                       break;}

                                   case 2 : {
                                       System.out.println("DINGA is 12th STD MATHS TEACHER ");
                                       break;}

                                   default: {
                                       System.out.println("INVALID");
                                       break;}

                               }


                  }

                  case 2 :
                  {  System.out.println("\t\t\tSELECT THE INPUT");
                      System.out.println("1.4th STD \n2.8th STD");
                      int a2 = x.nextInt();

                      switch (a2)
                      {
                          case 1 : {
                              System.out.println("MANGA is 4th STD SCIENCE TEACHER ");
                              break;}

                          case 2 : {
                              System.out.println("MANGI is 8th STD SCIENCE TEACHER ");
                              break;}

                          default: {System.out.println("INVALID");
                                   break;}

                      }


                  }



              }








          }


 }
