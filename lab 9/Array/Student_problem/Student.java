import java.util.*;

class Details {
    Scanner input = new Scanner(System.in);

    String name;
    int age;
    double fees, average;
    double [] subject = new double[5];

    Details(String name, int age, double fees) {
        this.name = name;
        this.age = age;
        this.fees = fees;
        marks();
    }

    void marks() {
        System.out.print("Enter marks of 5 subjects separeted by space: ");
        for(int i = 0; i < 5; i++)
            subject[i] = input.nextDouble();
    }

    void reportSheet() {
        for(int i = 0; i<5; i++){
            average += subject[i];
        }
        average = average/5;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Fees: "+fees);
        System.out.println("Average: "+average);
    }
}

/**
 * Student
 */
public class Student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double fees;
        Details [] student;
        student = new Details[5];
        for (int i = 0; i < 1; i++) {
            int j = i+1;
            System.out.print("Enter name of the Student "+j+" : ");
            name = input.nextLine();
            System.out.print("Enter age of the student "+j+" : ");
            age = input.nextInt();
            System.out.print("Enter fees of the student "+j+" : ");
            fees = input.nextDouble();
            student[i] = new Details(name, age, fees);
            System.out.println("_______________________________");
        }

        for(int i = 0; i < 1; i++)
            student[i].reportSheet();
    }
}
