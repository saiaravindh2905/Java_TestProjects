import java.util.Arrays;
import java.util.*;
import java.io.*;

class Dish
{
    private String dname;
    private double dprice;
    private String desc;
    private int did;

    private Dish()
    {

    }
    private Dish(String dname,double dprice,String desc,int did)
    {
        this.dname=dname;
        this.dprice=dprice;
        this.desc=desc;
        this.did=did;
    }

    public String getDname() {
        return dname;
    }

    public double getDprice() {
        return dprice;
    }

    public String getDesc() {
        return desc;
    }

    public int getDid() {
        return did;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public static Dish getdish(String dname,double dprice,String desc,int did)
    {
        return new Dish(dname,dprice,desc,did);
    }


}

class Bill
{
    static Scanner x = new Scanner(System.in);
    Dish []dishes = new Dish[10];

    public Bill()
    {

    }

    public void AddDish()
    {
        int count =0;
        //  boolean b = true;
        for(int j=0; j<dishes.length; j++,count++)
        {

            if(dishes[j]==null)
            {
                for (int i = count; i < dishes.length; i++)
                {
                    if (dishes[i] == null)
                    {
                        System.out.println("Enter the Dish Name : ");
                        String dname = x.next();

                        System.out.println("Enter the Dish Price : ");
                        double dprice = x.nextDouble();

                        System.out.println("Enter the Dish Description : ");
                        String desc = x.next();

                        System.out.println("Enter the Dish ID : ");
                        int did = x.nextInt();

                        this.dishes[i] = Dish.getdish(dname, dprice, desc, did);

                         break;


                    }
                   break;

                }// object adding for loop ends

                break;

            }
            else
            {

                if(count<9)
                {
                       // nothing
                }
                else if (count==9)
                {
                    System.out.println("\n\nCart is full\n\n");
                }


            }


        }


    }//add dish ends

    public void RemoveDish()
    {
        System.out.println("Remove the Dish by Dish name (or) Dish ID ");
        System.out.println("1. By Dish name \n2. By Dish ID");
        int rd=x.nextInt();

        switch (rd)
        {
            case 1 :
            {
                System.out.println("Enter the name of the DIsh you Want to Remove (Case Sensitive) :");
                String user_dname = x.next();

                for (int i=0; i<dishes.length; i++)
                {
                    if(dishes[i]!=null)
                    {
                        if (dishes[i].getDname().equals(user_dname))
                        {
                            System.out.println(dishes[i].getDname()+" is Removed from the Cart");
                            dishes[i] = null;
                            break;
                        }


                    }


                }



                break;
            }
            case 2 :
            {
                System.out.println("Enter the ID of the Dish you Want to Remove :");
                int user_did = x.nextInt();

                for (int i=0; i<dishes.length; i++)
                {
                    if(dishes[i]!=null) {
                        if (dishes[i].getDid() == user_did) {
                            System.out.println(dishes[i].getDname()+" is Removed from the Cart");
                            dishes[i] = null;
                            break;

                        }

                    }

                }



                break;
            }




        }




    }// removedish method exit

    public void SortDishes()
    {
        Dish d;
        boolean s = true;

        do {
            System.out.println("Sort By : ");
            System.out.println("1. Price : Lower to Higher \n2. Price : Higher to Lower  \n3. Exit");
            int sb = x.nextInt();

            switch (sb)
            {
                case 1:
                {
                    for(int i=0; i<dishes.length-1; i++)
                    {
                        if(dishes[i]!=null)
                        {
                            for (int j = 0; j < dishes.length - 1; j++) {
                                if (dishes[j] != null && dishes[j + 1] != null) {
                                    if (dishes[j].getDprice() > dishes[j + 1].getDprice()) {
                                        d = dishes[j];
                                        dishes[j] = dishes[j + 1];
                                        dishes[j + 1] = d;
                                    }
                                }

                            }
                        }

                    }

                    System.out.println("Sorting Done");

                    break;
                }

                case 2:
                {
                    for(int i=0; i<dishes.length-1; i++)
                    {
                        if(dishes[i]!=null) {
                            for (int j = 0; j < dishes.length - 1; j++) {
                                if (dishes[j] != null && dishes[j + 1] != null) {
                                    if (dishes[j].getDprice() < dishes[j + 1].getDprice()) {
                                        d = dishes[j];
                                        dishes[j] = dishes[j + 1];
                                        dishes[j + 1] = d;

                                    }

                                }

                            }

                        }

                    }

                    System.out.println("Sorting Done");

                    break;
                }

                case 3:
                {
                     s=false;
                       break;
                }


            }

        }while (s);

    }// sorting dishes exit

    public void GenerateBill()throws Exception
    {
       /* FileWriter f = new FileWriter("E:\\Bill\\Dishbill1.txt");
        f.write(" ");
        f.close();
        Date d = new Date();
        System.out.println(d.toLocaleString());*/
        Date d = new Date();
        int serial = 1;

        System.out.println(" S.no\t\tDishName\t\t\t\tPrice");
        System.out.println("-------------------------------------------------");
        String bill_heading = " S.no\t\tDishName\t\t\t\tPrice";
        String bill_line = "-------------------------------------------------";

        FileWriter f = new FileWriter("E:\\Games\\New folder\\b1.txt");
        f.write("Online Foodz\n");
        f.write(bill_heading+"\n");
        f.write(bill_line+"\n");


        for(int i=0 ; i<dishes.length ; i++,serial++)
        {


                    System.out.println(""+serial+" \t\t\t"+dishes[i].getDname()+" \t\t\t\t"+dishes[i].getDprice()+"\t "+d.toLocaleString());
                    System.out.println(" ");


                    String dishd = (""+serial+" \t\t\t"+dishes[i].getDname()+" \t\t\t\t"+dishes[i].getDprice()+"\t "+d.toLocaleString());

                    f.write(dishd+"\n");
                    dishd=null;



        }

        f.close();


    }

    public void DetailsofCart()
    {
        int sno=1;

        System.out.println("\t\t ** Detils of Dish Cart ** \n\n");
        for(int i=0; i<dishes.length; i++)
        {
            if(dishes[i]!=null) {

                System.out.println("S.No : "+sno); sno++;
                System.out.println("**********************\n");
                System.out.println("Dish Name : " + dishes[i].getDname());
                System.out.println("Dish Price : " + dishes[i].getDprice());
                System.out.println("Dish Description : " + dishes[i].getDesc());
                System.out.println("Dish ID : " + dishes[i].getDid());
                System.out.println("\n***********************\n");
            }
           /* else if(dishes[i]==null)
            {
                System.out.println(" ");
            }*/


        }

    }






}
class testing01
{
    static Scanner x = new Scanner(System.in);


    public static void main(String[] args)throws Exception
    {
        

        Bill ref = new Bill();

       /* ref.dishes[0]=Dish.getdish("Briyani",150,"good",101);
        ref.dishes[1]=Dish.getdish("Noodles",350,"good",102);
        ref.dishes[2]=Dish.getdish("Idli",100,"good",103);
        ref.dishes[3]=Dish.getdish("Dosa",450,"good",104);
        ref.dishes[4]=Dish.getdish("CurdRice",250,"good",105);
        ref.dishes[5]=Dish.getdish("SambarRice",180,"good",106);
        ref.dishes[6]=Dish.getdish("lemonRice",350,"good",107);
        ref.dishes[7]=Dish.getdish("Parotta",170,"good",108);
        ref.dishes[8]=Dish.getdish("Poori",50,"good",109);
        ref.dishes[9]=Dish.getdish("Pongal",90,"good",110); */ //for testing purpose



        boolean mb=true;
      do
      {


          System.out.println("Welcome to Online Foodyy\n");
          System.out.println("1.Add dish \n2.Remove dish\n3.Sort dish\n4.Generate bill\n5.Details of Cart\n6.Exit");
          int ms=x.nextInt();

          switch (ms)
          {
              case 1 :
              {
                  ref.AddDish();
                  break;
              }

              case 2 :
              {
                  ref.RemoveDish();
                  break;
              }

              case 3 :
              {
                  ref.SortDishes();

                  break;
              }

              case 4 :
              {
                  ref.GenerateBill();

                  break;
              }

              case 5 :
              {
                  ref.DetailsofCart();
                  break;
              }

              case 6 :
              {
                  mb=false;
                  System.out.println("Exiting...");
                  Thread.sleep(500);
                  break;

              }

              case 7 : {
                  System.out.println(Arrays.toString(ref.dishes));
              }// for checking the array address [testing purpose only]

          }


      }while (mb);


    }


}

