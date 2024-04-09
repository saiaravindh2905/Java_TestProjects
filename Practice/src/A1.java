interface A1
{
    public void m1();

}

interface A2
{

    public void m1();

}
    
abstract class Child1
{
    int r=40;

    public void m1()
    {
        System.out.println("Child 1");
    }

    public void m2(int a)
    {
        System.out.println("Child 1");
    }

    public void m3()
    {
        System.out.println("Child 2");
    }


}

class Child2 extends Child1
{
    int p = 50;

    public void m1()
    {
        System.out.println("Child 2");
    }


    public void m2()
    {
        System.out.println("Child 2");
    }
}


class Child extends Child2 implements A1,A2
{
    int c = 30;




    public static void main(String[] args)
    {
        Child c = new Child();

        A1 ref1 = new Child();

        A2 ref2 = new Child();

        A1 ref3 = new A1() {
            @Override
            public void m1() {
                System.out.println("A1");
            }
        };

        A2 ref4 = new A2()
        {
            @Override
            public void m1()
            {
                System.out.println("A2");
            }

        };


        ref1.m1();
        ref2.m1();
        ref3.m1();
        ref4.m1();

        c.m1();
        c.m2();
        c.m3();


    }

    public void m1()
    {
        System.out.println("hello");
    }


}


final class R
{

    public static void main(String[] args) {
        int pq = 55;




    }



}


