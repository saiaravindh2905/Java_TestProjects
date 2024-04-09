public class SaiAravindh
{

    public static void main(String[] args) {

        // widening
        // done by Implicitly (or) Explicitly


        int a = 15;
        System.out.println(a);

        double b = a;// Widening implicitly-( TYPE CONVERSION ) done by compiler (because of NO data loss)
        System.out.println(b);

        double c = (double)a; // Widening explicitly -- ( TYPE CASTING ) done by programmer
        System.out.println(c);

        // narrowing
        // done ONLY by Explicitly


        double p = 17.5;
        System.out.println(p);

        int q = (int)p;
        System.out.println(q); // Narrowing - explicitly -- ( TYPE CASTING )
                              // data loss happened  ----



         int r = -65;
         char ch = (char)r;
        System.out.println(ch);





    }



}
