public class R1
{
    static int a = 1;

    public static void main(String[] args) {

        System.out.println("Hi");
        demo();


    }


    public static void demo()
    {

        System.out.println(a);
        a++;
        demo();


    }






}
