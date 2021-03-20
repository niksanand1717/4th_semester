import java.util.*;

class Calculate{

    void factorial(int number){
        long result = 1;
        if (number == 0)
            System.out.println("Factorial of "+number+" : "+result);
        else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println("Factorial of "+number+" : "+result);
        }
    }

}

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        int number = input.nextInt();
        Calculate output = new Calculate();
        output.factorial(number);
    }
}
