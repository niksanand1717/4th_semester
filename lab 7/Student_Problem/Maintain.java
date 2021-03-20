class Student {

    static String univName = "Graphic Era Hill University";
    String name;
    int age;
    double fees;

    Student(String name, int age, double fees) {
        this.name = name;
        this.age = age;
        this.fees = fees;
        printDetails();
    }

    void printDetails() {
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nFees: "+this.fees+"\nStudent of: "+univName+"\n\n");
    }

}

public class Maintain {

    public static void main(String[] args) {
        Student S1 = new Student("Nikhil Anand", 19, 140825);
        Student S2 = new Student("Pankaj Bhandari", 19, 85825);
        Student S3 = new Student("Ansh Riyal", 20, 90825);

    }

}
