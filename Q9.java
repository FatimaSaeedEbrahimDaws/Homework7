public class Q9 {

    public class Person
    {
       protected String name;
        protected int birthYear;

        public Person() {
        }

        public Person(String n, int byear)
        {
            name = n;
            birthYear = byear;
        }


        public String toString()
        {
            return "Person[name=" + name + ",birthYear=" + birthYear + "]";
        }
    }

    public class Instructor extends Person
    {
        private double salary;


        public Instructor(String n, int byear, double s)
        {
            super(n, byear);
            salary = s;
        }


        public String toString()
        {
            return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
        }
    }


    public class Student extends Person
    {
        private String major;


        public Student(String n, int byear, String m)
        {
            super(n, byear);
            major = m;
        }


        public String toString()
        {
            return "Student[super=" + super.toString() + ",major=" + major + "]";
        }
    }



}
