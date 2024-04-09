import java.util.Scanner;

class wl4
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)

    {
        System.out.println("ENTER THE NUMBER :  ");
        long num = x.nextLong();
        long Ecount = 0L;
        long Ocount = 0L;
        long NENO   = 0L;
        long last   = 0L;

          if (num >0)
            while ( num > 0 )
            {
                last = num%10;

                if ( last == 0)
                {
                    NENO++;
                }
                else if ( last%2 == 0)
                {
                    Ecount++;
                }
                else if (last%2 != 0)
                {
                    Ocount++;
                }

               num/=10;

            }
          else if (num < 0)
          {
              while ( num < 0 )
              {
                  last = num%10;

                  if ( last == 0)
                  {
                      NENO++;
                  }
                  else if ( last%2 == 0)
                  {
                      Ecount++;
                  }
                  else if (last%2 == 1)
                  {
                      Ocount++;
                  }

                  num/=10;

              }

          }


        System.out.println("Count OF Even : " +Ecount);
            System.out.println("Count OF Odd  : " +Ocount);
            System.out.println("Count OF NENO : " +NENO);









    }


}
