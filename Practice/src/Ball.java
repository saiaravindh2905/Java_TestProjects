import com.sun.jdi.event.StepEvent;

class Ball
{
       private  double radius;

       public Ball()
       {

       }

       public Ball(double radius)
       {
           this.radius=radius;
       }

    public double getRadius() {
        return radius;
    }


}

class VolleyBall extends Ball
{

    private String Ballname = "Volleyball";
    private VolleyBall()
    {

    }

    private VolleyBall(double r)
    {
       super(r);
    }

    public String getBallname() {
        return Ballname;
    }

    public static VolleyBall getvb(double r)
    {
        return new VolleyBall(r);
    }



}

class BasketBall extends Ball
{
    private String Ballname = "Basketball";
    private BasketBall()
    {

    }

    private BasketBall(double r)
    {
        super(r);
    }

    public static BasketBall getbb(double r)
    {
        return new BasketBall(r);
    }




}

class Bdriver
{

    public static void main(String[] args)
    {

         VolleyBall v1 = VolleyBall.getvb(15);

        System.out.println(v1.getRadius());



    }



}