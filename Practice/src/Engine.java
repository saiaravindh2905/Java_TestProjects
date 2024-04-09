class Engine {
    // Engine implementation
     private String ename;

     Engine()
     {

     }
     Engine(String ename)
     {
       this.ename=ename;
     }

    public String getEname() {
        return ename;
    }

}

class Car
{
    private String cname;
    private Engine engine; // Composition relationship

    Car()
    {

    }

   Car(String cname,Engine engine)
    {
        this.cname=cname;
        this.engine = engine; // Creating Engine object within Car
    }

    public String getCname() {
        return cname;
    }

    public void start()
    {
        System.out.println(getCname()+" Car of "+engine.getEname()+" engine is Started ");
    }


}


class EC
{

    public static void main(String[] args) {

        // Example for Composition.

        Engine e = new Engine("v10");
        Car c = new Car("Volvo",e);

        System.out.println(c.getCname());
        c.start();




    }



}