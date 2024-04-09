class switch1
{
     public static void main(String [] args)

     {
         int a =2, b=1;

         switch (a)
         {
             case 1: System.out.println("JAVA");
             case 2: System.out.println("SQL");
             case 3: System.out.println("PYTHON");

             default: System.out.println("INVALID");

         }

         switch (b)
         {
             case 1: System.out.println("JAVA");
             case 2: System.out.println("SQL");
                     break;                             // to stop main thread to run below
             case 3: System.out.println("PYTHON");

             default: System.out.println("INVALID");

         }



     }


}

