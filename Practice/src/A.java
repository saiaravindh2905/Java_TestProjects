interface A {
    void m1();

   public static void m3()
   {

   }
}
class B
{
    int a =10;
    public void m1()
    {
        System.out.println("SQL");
    }

}


class C extends B
{
  int b =20;
    @Override
    public void m1()
    {
        System.out.println("Java");
    }



}

class D
{
    public static void main(String[] args) {

       B ref = new B();
        System.out.println(ref.a);



    }
}
