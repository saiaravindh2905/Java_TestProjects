import java.io.*;

public class Student extends Object
{

    String sname;
    int sid;
    double smarks;

    Student()
    {

    }

    Student(String sname,int sid,double smarks)
    {
        super();
        this.sname=sname;
        this.sid=sid;
        this.smarks=smarks;
    }


    @Override
    public String toString()
    {
        return sname+":"+sid+":"+smarks;
    }
    @Override
    public boolean equals(Object o)
    {
        Student s = (Student)o;
        if( this.sid == s.sid  && this.smarks == s.smarks )
        {
            return true;
        }

        else
        {
            return false;
        }

    }
       @Override
        public int hashCode()
        {
            return sname.hashCode()+Integer.hashCode(sid)+Double.hashCode(smarks);
        }


}


class Teacher extends Student
{

    String tname;
    int age;
    String skill;


    public Teacher()
    {//l.o.i

    }




    public Teacher(String tname, int age, String skill)
    {
        this.tname = tname;
        this.age = age;
        this.skill = skill;
    }

    public String getTname() {
        return tname;
    }

    public int getAge() {
        return age;
    }

    public String getSkill() {
        return skill;
    }

}


class StudentUI
{

    Object[][] cls =
            {
                    {new Student("Dinga", 101, 65.5), new Student("Dingi", 102, 88.5), new Student("Sangi", 103, 12.0), new Teacher("tabrez", 29, "java")},
                    {new Student("Manga", 201, 25.5), new Student("Mangi", 202, 75.5), new Teacher("Bharath", 29, "SQL")},
                    {new Student("Ringa", 301, 69.5), new Student("Ringi", 302, 60.7), new Student("Sanga", 303, 29.0), new Student("Shambhu", 304, 98.5), new Teacher("harish", 29, "Web Tech")}

            };



    public static void main(String[] args)throws Exception
    {

       // Student[][] sl = (Student[][])cls;// Downcasting


      /*  System.out.println("Classroom\n");
        System.out.println("Select the Input");
        System.out.println("1. Pass Students \n 2. Fail Students \n 3. Details Of Class ");*/

          // ui.PassStudents();




    }

    public void PassStudents()
    {
        for(int i=0; i<cls.length; i++)
        {
            for(int j=0; j<cls[i].length; j++)
            {
                Student[][] sl = (Student[][])cls;// Downcasting

                if( sl[i][j].smarks > 40 )
                {
                    if(i==0)
                    {
                        System.out.print(" 8th-'A' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }
                    else if(i==1)
                    {
                        System.out.print(" 10th-'B' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }
                    else if(i==2)
                    {
                        System.out.print(" 12th-'A' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }


                }

            }

        }


    }

    public void FailStudents()
    {

        for(int i=0; i<cls.length; i++)
        {
            for(int j=0; j<cls[i].length; j++)
            {
                Student[][] sl = (Student[][])cls;// Downcasting

                if( sl[i][j].smarks <= 40 )
                {
                    if(i==0)
                    {
                        System.out.print(" 8th-'A' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }
                    else if(i==1)
                    {
                        System.out.print(" 10th-'B' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }
                    else if(i==2)
                    {
                        System.out.print(" 12th-'A' ");
                        System.out.println(sl[i][j].toString() + "\n");
                    }


                }

            }

        }


    }

    public void ClassResult()
    {
        int pc1=0,fc1=0,pc2=0,fc2=0,pc3=0,fc3=0;

        for(int i=0; i<cls.length; i++)
        {
            for(int j=0; j<cls[i].length; j++)
            {
                Student[][] sl = (Student[][])cls;// Downcasting

                if( sl[i][j].smarks > 35 )
                {
                    if(i==0)
                    {
                        pc1++;
                    }
                    else if(i==1)
                    {
                        pc2++;
                    }
                    else if(i==2)
                    {
                        pc3++;
                    }


                }
                else if( sl[i][j].smarks <= 40 )
                {
                    if(i==0)
                    {
                        fc1++;
                    }
                    if(i==1)
                    {
                        fc2++;
                    }
                    if(i==2)
                    {
                        fc3++;
                    }



                }


            }

        }

        System.out.println("Class 8-A");
        System.out.println("Total no.of Students : "+(pc1+fc1));
        System.out.println("No of passed Students : "+pc1);
        System.out.println("No of failed Students : "+fc1);
        System.out.println("*********************************");
        System.out.println("Class 10-B");
        System.out.println("Total no.of Students : "+(pc2+fc2));
        System.out.println("No of passed Students : "+pc2);
        System.out.println("No of failed Students : "+fc2);
        System.out.println("*********************************");
        System.out.println("Class 12-A");
        System.out.println("Total no.of Students : "+(pc3+fc3));
        System.out.println("No of passed Students : "+pc3);
        System.out.println("No of failed Students : "+fc3);



    }











}
