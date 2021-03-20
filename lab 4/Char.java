import java.util.*;

public class Char
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // String name = br.readLine();
        // System.out.println(name);
        // char ch = (char)br.read();
        // System.out.println("Character : "+ch);
        Scanner sc = new Scanner(System.in);
        char ch2 = sc.next().charAt(0);
        System.out.println("Character : "+ch2);
    }
}
