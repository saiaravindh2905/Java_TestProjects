class Laptop
{
   private double price;

    Laptop()
    { // l.o.i

    }
    Laptop(double price)
    {
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }



}

class Dell extends Laptop
{
    private String Lname = "DELL";
     private Dell(double price)
     {
         super(price);
     }


     public static Dell getDell(double price)
     {
         return new Dell(price);
     }

     public String getLname()
     {
         return Lname;
     }





}

class Lenovo extends Laptop
{
    private String Lname = "LENOVO";
    private Lenovo(double price)
    {
        super(price);
    }


    public static Lenovo getLenovo(double price)
    {
        return new Lenovo(price);
    }

    public String getLname()
    {
        return Lname;
    }





}

class Asus extends Laptop
{
    private String Lname = "ASUS";
    private Asus(double price)
    {
        super(price);
    }


    public static Asus getAsus(double price)
    {
        return new Asus(price);
    }

    public String getLname()
    {
        return Lname;
    }


}

class Hp extends Laptop
{
    private String Lname = "HP";
    private Hp(double price)
    {
        super(price);
    }


    public static Hp getHp(double price)
    {
        return new Hp(price);
    }

    public String getLname()
    {
        return Lname;
    }


}


class Box
{
   Laptop lap;

   private Box()
   {// l.o.i

   }
   public static Box getbox()
   {
       return new Box();

   }
   public boolean isBoxEmpty()
   {
        return lap==null;
   }

   public void addlaptop()
   {
       if(isBoxEmpty())
       {

       }


   }




}