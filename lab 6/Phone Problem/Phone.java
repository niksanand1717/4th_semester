import java.util.*;

class Telcall {

    String sname, phno;
    double amt, rental_charges = 500;
    int n;

    Telcall (String subscriber_name, String phone_number, int number_of_calls_made) {
        this.sname = subscriber_name;
        this.phno = phone_number;
        this.n = number_of_calls_made;
        compute();
    }

    void compute() {

        if (n >= 1 && n <= 100)
            amt = rental_charges;
        else if (n >= 101 && n <= 200)
            amt = n*1 + rental_charges;
        else if (n >= 201 && n <= 300)
            amt = n*1.2 + rental_charges;
        else
            amt = n*1.5 + rental_charges;

        display();
    }

    void display() {
        System.out.println("Monthly Bill of "+this.sname+" : "+this.amt);
    }
}

public class Phone {

    public static void main(String[] args) {
        Telcall customer1 = new Telcall("Nikhil Anand", "9572068200", 294);
    }

}
