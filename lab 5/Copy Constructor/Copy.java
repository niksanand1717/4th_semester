class Example
{
    double length, width, height;

    Example(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Example(Example obj)
    {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    void print()
    {
        System.out.println("Length:- "+this.length+"\nWidth:- "+this.width+"\nHeight:- "+this.height);
    }
}

public class Copy
{
    public static void main(String[] args)
    {
        Example obj1 = new Example(30, 40, 50);
        Example obj2 = new Example(obj1);
        obj2.print();
    }
}
