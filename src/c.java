class c
{
    public int a = 10;
    int b = 20;
    private  int c = 30;

    static int d = 40;

    public static void main(String []args)
    {
        System.out.println(d);
        c c1 = new c();
        System.out.println(c1.a);
        System.out.println("d : "+c1.d);
        d = c1.a;
        System.out.println(d);
    }

    public int m1()
    {
        int r = 15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return(r);
    }


}