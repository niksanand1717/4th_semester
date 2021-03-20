

class Constructor
{
    int num1;
    double num2;
    String name;

    Constructor()
    {
        num1 = 10;
        num2 = 25.12;
        name = "Nikhil Anand";
        System.out.println("Value has been set by default Constructor");
    }
}


public class Example
{
    public static void main(String[] args)
    {
        Constructor obj = new Constructor();
        System.out.println(obj.name);
        double sum = obj.num1 + obj.num2;
        System.out.println(sum);
    }
}
