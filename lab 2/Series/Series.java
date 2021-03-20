import java.util.*;


public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth term to find the sum of series : ");
        int number = input.nextInt();
        sumofseries(number);
    }

    static void sumofseries(int nth_term){
        int i;
        double result = 0;
        for (i = 1; i <= nth_term; i++){
            result = result + (i / calculate_fact(i+1));
        }
        System.out.println("Sum of series: "+result);
    }

    static double calculate_fact(int number){
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
