interface I1
{
    public static void m1()
    {
        System.out.println("i1");
    }

    public void im1();

}

interface I2
{
    public static void m1()
    {
        System.out.println("i2");
    }


    public void im2();

}

abstract class C1 implements I1,I2
{
    public static void main(String[] args)
    {

        I1.m1();
        I2.m1();
        
    }

}