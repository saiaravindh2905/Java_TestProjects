class Test01
{
    public static void main(String[] args) {

      /*  int [][]a = {
                {1,2,3,4,5,},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };


        int [][]res = new int[5][5];

        for(int i=0 ; i<res.length; i++)
        {
            for(int j=0; j< res.length; j++)
            {
                  if(i==j || (i+j)==4)
                  {
                      res[i][j]=a[i][j];
                  }
                  else {


                  }



            }



        }

        for (int i = 0; i<res.length; i++)
        {
            for(int j = 0; j<res[i].length ; j++ )
            {
                System.out.print(res[i][j]+" ");

            }
            System.out.println("");


        } */



       /* int [][]a = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        int [][]b = {
                {1,0,1,0},
                {0,1,1,1},
                {1,1,0,1},
                {1,1,1,1}
        };




        int [][] res = new int [4][4];


        for(int i=0 ; i<res.length; i++)
        {
            for(int j=0; j< res.length; j++)
            {
                 res[i][j] = (a[i][j]+b[i][j]);


            }



        }

        for (int i = 0; i<res.length; i++)
        {
            for(int j = 0; j<res[i].length ; j++ )
            {
                System.out.print(res[i][j]+" ");

            }
            System.out.println("");


        } */













    }


}

class Amazon
{
    public static void main(String[] args)
    {



    }


}



class Product extends Object
{
    String pname;
    int pid;
    double price;


    Product(String pname,int pid,double price)
    {
        super();
        this.pname=pname;
        this.pid=pid;
        this.price=price;
    }

    @Override
    public String toString()
    {
        return pname+" : "+pid+" : "+price;
    }
    
}


