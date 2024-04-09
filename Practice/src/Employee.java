/*import java.util.Scanner;

class Employee
{
    static Scanner x = new Scanner(System.in);
    // States
    private int eid;
    private String ename;
    private double sal;

    // constructor

    Employee()
    {// l.o.i

    }

    Employee(int eid,String ename,double sal) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;

    }

    public String getEname()
    {
        return ename;
    }

    public int getEid() {
        return eid;
    }

    public double getSal() {
        return sal;
    }


    public void DetailsOfEmployee()
    {
        System.out.println("Employee name : "+ename);
        System.out.println("Employee id : "+eid);
        System.out.println("Employee salary : "+sal);
        System.out.println("******************\n");


    }

    public Boolean Verification()
    {
        System.out.println("Enter your Contact number to verify : ");
        int u_eid = x.nextInt();

        if(eid == u_eid)
        {
            System.out.println("Generating OTP");
            int S_otp = (int)(Math.random()*99+999);
            System.out.println(S_otp);
            System.out.println("Enter the OTP : ");
            int user_otp = x.nextInt();


            if(S_otp==user_otp)
            {
                return true;
            }


        }


        return false;
    }



}*/
class Employee
{
       int eid ;
       String ename;
       long [] contacts;

       Employee()
       {// l.o.i

       }

       Employee(int eid,String ename,long[] contacts)
       {
           this.eid= eid;
           this.ename=ename;
           this.contacts=contacts;

       }


       public void DetailsofEmployee()
       {
           System.out.println("Employee name : "+ename);
           System.out.println("Employee id : "+eid);
           System.out.println("Employee contact : "+contacts);

       }


     /*  public long addContact(long [] contacts)
       {

       }*/



}



