import java.util.*;

class Box{
    //Scanner input = new Scanner(System.in);
    double length, width, height;
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double calculate() {
        double volume;
        volume = length*width*height;
        return volume;
    }

}


public class BoxProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double len, wid, hei, result;
        Box []  B;
        B = new Box[5];
        for(int i = 0; i < 5; i++) {
            int j = i+1;
            System.out.println("_______________________________");
            System.out.print("Enter length: ");
            len = input.nextDouble();
            System.out.print("Enter width: ");
            wid = input.nextDouble();
            System.out.print("Enter height: ");
            hei = input.nextDouble();
            B[i] = new Box(len, wid, hei);
            result = B[i].calculate();
            System.out.println("\nVolume of Box "+j+" : "+result+"\n\n");

        }
    if(input!=null)
        input.close();

    }
}
