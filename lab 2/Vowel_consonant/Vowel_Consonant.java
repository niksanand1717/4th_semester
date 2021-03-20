import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        isconsonant(character);
    }

     private static void isconsonant(char character){
        if(character == 'a' || character == 'e'|| character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
            System.out.println(character+" is a Vowel");
        else
            System.out.println(character+" is a consonant");
    }
}
