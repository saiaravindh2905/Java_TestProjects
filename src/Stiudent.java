class Student extends Object
{
    int sid;
    double marks;

    Student(int sid, double marks)
    {
        this.sid=sid;
        this.marks=marks;
    }



    @Override
    public String toString()
    {
        return "idiot";
    }
    @Override
    public boolean equals(Object o)
    {
        Student s = (Student)o;
        if(this.sid == s.sid  && this.marks==s.marks )
        {
            return true;
        }

        else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        Student s1 = new Student(101,75);
        Student s2 = new Student(102,85);


        System.out.println( s1.toString() );
        System.out.println( s2.toString() );

        System.out.println( s1.equals(s2));
        System.out.println( s2.equals(s1));
        System.out.println( s1.equals(s1));
        System.out.println( s2.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());




    }





}
