import java.io.*;

public class Reader {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        System.out.print("Enter a string, BufferedReader class is in action: ");
        BufferedReader br = new BufferedReader(input);
        String sentence = br.readLine();
        System.out.println("String you entered: "+sentence);
    }
}
