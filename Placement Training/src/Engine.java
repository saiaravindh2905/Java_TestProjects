class Engine
{
    static int wheels = 4;
   private String type= "v12";

    Engine()
    {

    }


    public void start()
    {
        System.out.println("Started");


    }

    public String getType() {
        return type;
    }



}

class Car
{
     Engine engine;

     String cname = "BMW";

     Car()
     {
         this.engine=new Engine();

     }

     public void carstart()
     {
           engine.start();
     }
     public void getEnginetype()
     {

     }




}

class CarE
{
    public static void main(String[] args) {

       Car c1 = new Car();
       c1.carstart();
       c1.engine.start();



    }


}
