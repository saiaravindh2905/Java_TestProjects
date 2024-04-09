import java.util.PrimitiveIterator;

class Sim
{
    // States
    private String Opname;
    private String BW;
    private double sprice;

    // Constructor
    private Sim()
    {

    }

    private Sim(String opname,String BW,double sprice)
    {
        this.Opname=opname;
        this.BW=BW;
        this.sprice=sprice;
    }

    // Getter method
            public String getOpname() {
                return Opname;
            }

            public String getBW() {
                return BW;
            }

            public double getSprice() {
                return sprice;
            }

                   // Setter method
                    public void setOpname(String opname) {
                        Opname = opname;
                    }

                    public void setBW(String BW) {
                        this.BW = BW;
                    }

                    public void setSprice(double sprice) {
                        this.sprice = sprice;
                    }

    // Sim obj Creation
    public static Sim getSim(String Opname,String BW,double sprice)
    {
        return new Sim(Opname,BW,sprice);
    }




}
class Mobile {
    private String mname;
    private String ram;
    private String storage;
    private double mprice;
    private Sim slot1, slot2;


    private Mobile()
    {

    }

    private Mobile(String mname, String ram, String storage, double mprice)
    {
        this.mname = mname;
        this.ram = ram;
        this.storage = storage;
        this.mprice = mprice;
    }

    // Getter

            public String getMname() {
                return mname;
            }

            public String getRam() {
                return ram;
            }

            public String getStorage() {
                return storage;
            }

            public double getMprice() {
                return mprice;
            }


            public static Mobile getMobile(String mname,String ram,String storage,double Mprice)
            {
                return new Mobile(mname,ram,storage,Mprice);
            }





}