import java.util.*;

class Account {

    String depositor_name, acc_type;
    long acc_no;
    double balance_amt;

    Scanner input = new Scanner(System.in);

    Account(String name, double opening_balance, long acc_no, String acc_type) {
        this.balance_amt = opening_balance;
        this.depositor_name = name;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
    }

    void deposit(double deposite_amt) {
        this.balance_amt += deposite_amt;
        System.out.println(deposite_amt+" has been credited to your account");
    }

    void check_balance() {
        System.out.println("Total Remaining Balance: "+this.balance_amt);
        System.out.print("Press 1 to withdraw\nPress 2 to exit:");
        char choice = input.next().charAt(0);
        switch (choice) {
            case '1': {
                    System.out.print("Enter amount to Withdraw: ");
                    double amt = input.nextDouble();
                    withdraw(amt);
                    break;
                }
            case '2':
                    System.exit(0);
        }
    }

    void withdraw(double withdraw_amt) {
        this.balance_amt -= withdraw_amt;
        System.out.println(withdraw_amt+" has been debited**\nRemaining Balance: "+balance_amt);
    }

    void id() {
        System.out.println("\n\nName of the Depositor: "+this.depositor_name);
        System.out.println("Balance: "+this.balance_amt);
        System.out.println("Account Number: "+this.acc_no);
        System.out.println("Account Type: "+this.acc_type);
    }
}

public  class Bank {
    public static void main(String[] args) {
            Account acc1 = new Account("Nikhil Anand", 5000, 1918508, "savings");
            acc1.check_balance();
            acc1.deposit(5000);
            acc1.withdraw(3000);
            acc1.id();
    }
}
