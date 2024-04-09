class test2
{
    public static void main(String [] args)
    {
        byte    a = 5;
        short   b = 10;
        int     c = 150, p = 200;
        long    d = 558L;

        float   e = 45.8f;
        double  f = 280.65;

        char    g ='D';
        System.out.println(g);
                g ='E';
                g ='F';
                g ='G';

        boolean h = true;
        boolean q = d>c;
        String  i = "java";
        String  j = "Script";


        System.out.println("----------------------------------------------------------------------");
              System.out.println("byte   datatype =  "+a);
        System.out.println("-----------------------------------------");
              System.out.println("short  datatype =  "+b);
        System.out.println("-----------------------------------------");
              System.out.println("int    datatype =  "+c);
        System.out.println("-----------------------------------------");
              System.out.println("long   datatype =  "+d);
        System.out.println("-----------------------------------------");
              System.out.println("float  datatype =  "+e);
        System.out.println("-----------------------------------------");
              System.out.println("double datatype =  "+f);
        System.out.println("-----------------------------------------");
              System.out.println("char   datatype =  "+g);
        System.out.println("-----------------------------------------");
              System.out.println("boolean datatype =  "+h);
        System.out.println("-----------------------------------------");
              System.out.println("String  datatype =  "+i);
        System.out.println("-----------------------------------------");
              System.out.println("C is Greater than B =  "+q);

        System.out.println("*******************************************************************************");

        System.out.println("Myself\tSai Aravindh S D\n\tFrom \"SALEM\"\nI Completed my \"B.Sc Degree\" in \'2021\'\n\t\t I\tJoined\tin\t\"QSPIDERS\"\t\n\tTO\t\'GAIN\'\tKNOWLEDGE about\n\t\t\t\"PROGRAMMING\" ");

        System.out.println("***************************************************************************************************************************************************");


              System.out.println("Addition       =  "+a+b);
              System.out.println("Subtraction    =  "+(c-b));
              System.out.println("Multiplication =  "+a*b);
              System.out.println("Division       =  "+c/b);
              System.out.println("Modulus        =  "+d%c);


        float   r1 = c;                   /*  Widening */
        double  r3 = d;                  /*  Widening */
        short   r2 =(short)c;           /* Narrowing */
        float   r4 =(float)b;          /* Narrowing */
        int     r5 =(int)e;

              System.out.println("Widening  =  "+r1);
              System.out.println("Widening  =  "+r3);
              System.out.println("Narrowing =  "+r2);
              System.out.println("Narrowing =  "+r4);
              System.out.println("Narrowing =  "+r5);

    }


}