/**
* Making a class named computer in which there is a static Variable
* named malware which contains a string "Rootkit" and a static function to
* print a Message
*/
class Computer {
    static String malware = "Rootkit";

    static void function() {
        System.out.println("The malware i like the most is "+malware);
    }

}

/**
 * Demonstration_of_static_method
 */
public class Demonstration_of_static_method {

    public static void main(String[] args) {
        Computer.function();
    }

}
