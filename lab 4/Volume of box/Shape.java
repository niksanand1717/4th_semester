import java.util.*;

class Volume
{
    double length, width, height, result;
    Scanner sc = new Scanner(System.in);

    void findvolume()
    {
        System.out.print("Enter Length of the box:- ");
        length = sc.nextDouble();
        System.out.print("Enter Width of the box:- ");
        width = sc.nextDouble();
        System.out.print("Enter Height of the box:- ");
        height = sc.nextDouble();
        result = length*width*height;
        System.out.println(result);
    }
}

public class Shape
{
    public static void main(String[] args)
    {
        Volume box = new Volume();
        box.findvolume();
    }
}
