import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner inputscannerobject = new Scanner(System.in);
        System.out.print("Enter a string, Scanner class is in action: ");
        String line = inputscannerobject.nextLine();
        System.out.println("String entered : "+line);
    }

}
