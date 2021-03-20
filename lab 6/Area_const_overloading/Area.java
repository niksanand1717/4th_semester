class Circle
{
    double radius, result;
    int int_radius;

    Circle(double radius)
    {
        this.radius = radius;
        calculate();
    }

    Circle(Circle obj)
    {
        this.radius = obj.radius;
        calculate();
    }

    Circle(int radius)
    {
        this.int_radius = radius;
        calculate(int_radius);
    }

    void calculate()
    {
        result = 3.14*this.radius;
        System.out.println("Area of Circle: "+result);
    }

    void calculate(int radius)
    {
        result = 3.14*int_radius;
        System.out.println("Area of Circle: "+result);
    }
}

class Rectangle
{
    double length, width, result;
    int int_length, int_width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
        calculate();
    }

    Rectangle(Rectangle obj)
    {
        this.length = obj.length;
        this.width  = obj.width;
        calculate();
    }

    Rectangle(int int_width, int int_length)
    {
        this.int_width  = int_width;
        this.int_length = int_length;
        calculate(int_width, int_length);
    }

    void calculate()
    {
        result = length*width;
        System.out.println("Area of Rectangle: "+result);
    }

    void calculate(int int_width, int int_length)
    {
        result = int_width*int_length;
        System.out.println("Area of Rectangle: "+result);
    }
}

class Triangle
{
    double height, base, result;
    int int_height, int_base;

    Triangle(double height, double base)
    {
        this.height = height;
        this.base   = base;
        calculate();
    }

    Triangle(Triangle obj)
    {
        this.height = obj.height;
        this.base   = obj.base;
        calculate();
    }

    Triangle(int int_height, int int_base)
    {
        this.int_height = int_height;
        this.int_base   = int_base;
        calculate(int_base, int_height);
    }

    void calculate()
    {
        result = 0.5*base*height;
        System.out.println("Area of Triangle: "+result);
    }

    void calculate(int int_base, int int_height)
    {
        result = 0.5*int_base*int_height;
        System.out.println("Area of Triangle: "+result);
    }
}

public class Area
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(7);
        Rectangle r1 = new Rectangle(26.23, 56.95);
        Triangle t1 = new Triangle(56.0,28.0);
        Triangle t2 = new Triangle(t1);
        Circle c2 = new Circle(0.3181);
    }
}
