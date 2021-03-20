/**
 * Static_block
 */
public class Static_block {

    static {
        System.out.println("Message printed before main");
        //System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("This has been printed from main function");
    }

}
