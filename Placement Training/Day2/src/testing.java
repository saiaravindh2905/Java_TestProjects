import java.util.Arrays;

public class testing
{
    static int a=5;
    static int r=14;

      int c =15;
 //   int c =75; variable already defined in the scope.

    static {
         a = 25;
        int b = 20;
        System.out.println("hi");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        testing t = new testing();
        int a = 100;
        int b = 150;
        System.out.println(testing.a);
        System.out.println(a);
        System.out.println(testing.a);
        System.out.println(t.a);
        System.out.println(t.c);
        System.out.println(r);


    }

    static {
        a=22;
    }

    static {
        a=23;
    }

    static {

        System.out.println("hello");
        r = 51;
    }




}
