class Company {

    String emp_name, specialisation;
    int salary, emp_id;
    static String company_name = "GEHU";

    void getDetails (String emp_name, int emp_id, String specialisation, int salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.specialisation = specialisation;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("\n\nName of employe: "+this.emp_name);
        System.out.println("Employe ID: "+this.emp_id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Company: "+this.company_name);
        System.out.println("Specialisation: "+specialisation);
    }

    static void modify(String company_name) {
        // Input provided by Scanner class is non-static so we can't take input
        // directly to static variable
        Company.company_name = company_name;
    }

}

public class Employe {

    public static void main(String[] args) {
        Company emp1 = new Company();
        emp1.getDetails("Nikhil Anand", 19011717, "AI & ML", 140825);
        emp1.showDetails();
        emp1.modify("gehu");
        emp1.showDetails();
    }

}
