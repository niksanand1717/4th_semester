import java.util.*;

class College
{
    public static void main(String args[])
    {
        // Scanner inp = new Scanner(System.in);
        Student s1 = new Student();
        s1.set_data();
        s1.show_data();
    }
}

class Student
{
    String name;
    int age, marks, fee;
    float average;

    Scanner inp = new Scanner(System.in);

    void set_data()
    {
        System.out.print("======INPUT======\n");
        System.out.print("Enter name : ");
        name = inp.nextLine();
        System.out.print("Enter age : ");
        age = inp.nextInt();
        System.out.print("Enter fee : ");
        fee = inp.nextInt();
        System.out.print("Enter marks : ");
        marks = inp.nextInt();
        System.out.print("Enter average : ");
        average = inp.nextInt();
    }

    void show_data()
    {
        System.out.print("\n\n=====OUTPUT=======\n");
        System.out.println("Name of Student : "+name);
        System.out.println("Age of Student : "+age);
        System.out.println("Fee of Student : "+fee);
        System.out.println("Marks of Student : "+marks);
        System.out.println("Average of Student : "+average);
    }
}
