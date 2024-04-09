class HarshaSir
{
    public void food()
    {
        System.out.println("Veg-food");
    }

    public void chess()
    {
        System.out.println("I like Chess");
    }

    HarshaSir()
    {// l.o.i

    }





}

class Shekar extends HarshaSir
{
    @Override
    public void food()
    {
        System.out.println("Non-Veg food");
    }

    Shekar()
    {
        super();
        //l.o.i

    }

    public static void main(String[] args) {

        HarshaSir ref = new Shekar();
        ref.food();
        HarshaSir ref1 = new HarshaSir();
        ref1.food();

    }




}
