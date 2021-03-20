import java.util.*;

class Example{

    String name, phno;
    int student_id, u_roll_no;
    double fee;

    void set_data(String name, String phno, int student_id, int u_roll_no, double fee){
        this.name = name;
        this.phno = phno;
        this.student_id = student_id;
        this.u_roll_no = u_roll_no;
        this.fee = fee;
    }

    void show_data(){
        System.out.println("Printing all data members set by 'this' keyword and a method:");
        System.out.println("Name: "+this.name);
        System.out.println("Phone Number: "+this.phno);
        System.out.println("Student ID: "+this.student_id);
        System.out.println("University Roll Number: "+this.u_roll_no);
        System.out.println("Fee Paid: "+this.fee);
    }


}

public class Keyword{

    public static void main(String[] args) {
        Example Object = new Example();
        Object.set_data("Nikhil Anand", "9572068866", 19011717, 1918508, 140825);
        Object.show_data();
    }

}
