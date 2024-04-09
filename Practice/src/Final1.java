class Final1
{
    final int a = 10;
    final int b;
    {
        b=15;
    }

    final static int c = 20;
    final static int d;

    static
    {
        d=25;
    }

    public final void m1()
    {
        System.out.println("Final1 class");
    }

    public static void main(String[] args) {



    }


}

class me2 extends Final1
{




}
