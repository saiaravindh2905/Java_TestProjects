import java.lang.Object;
import java.util.*;

class Student extends Object
{
     String sname;
     int sid;
     double smarks;

     Student()
     {

     }

     Student(String sname,int sid,double smarks)
     {
         this.sname=sname;
         this.sid=sid;
         this.smarks=smarks;
     }


/*  @Override
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
        return
    } */


}

class Teacher extends Student {
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


class StudentUi
{

        public static void main(String[] args) {

            Student[][] sl = {
                    {new Teacher("tabrez", 29, "java")},
                    {new Teacher("bharath", 29, "SQL")},
                    {new Teacher("harish", 29, "Web Tech")}
            }; // upcasting



            Student[][] School = {
                    {new Student("Dinga", 101, 65.5), new Student("Dingi", 102, 88.5), new Student("Sangi", 103, 12.0),},
                    {new Student("Manga", 201, 25.5), new Student("Mangi", 202, 75.5)},
                    {new Student("Ringa", 301, 69.5), new Student("Ringi", 302, 60.7), new Student("Sanga", 303, 29.0), new Student("Shambhu", 304, 98.5)}
            };






        }


}

