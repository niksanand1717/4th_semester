class Cons
{
    String name;
    int studentID;
    double cGPA;

    Cons(String name, int studentID, double cGPA)   //Parameterized Constructor
    {
        this.name = name;
        this.studentID = studentID;
        this.cGPA = cGPA;
    }

    void print()
    {
        System.out.println("Name:- "+name+"\nStudent ID:- "+studentID+"\nCGPA:- "+cGPA);
    }
}

public class Parameter
{
    public static void main(String[] args)
    {
        Cons Obj = new Cons("Nikhil Anand", 19011717, 8.34);
        Obj.print();
    }
}
