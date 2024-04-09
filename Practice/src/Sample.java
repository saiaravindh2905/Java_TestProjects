class Sample_A
{
    static int a = 10;
    int b = 20;

    void m1()  // non-static method
    {
        System.out.println("Hi");
    }

    static void m1(int r)
    {
        System.out.println("Hello");
    }



    {
        System.out.println("bye");
    }

    static
    {
        int e = 155;
        System.out.println(e);
    }


}

class Sample_B extends Sample_A
{
    public static void main(String[] args)
    {


        Sample_A ref = new Sample_A();
        Sample_A ref1 = new Sample_A();

        Sample_A ref2 = new Sample_A();







    }



}