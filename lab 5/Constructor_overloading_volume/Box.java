class Volume {

    double volume;

    Volume (double length, double width, double height) {
        volume = length*width*height;
        System.out.println("Cuboid double:");
        print();
    }

    Volume (int length, int width, int height) {
        volume = length*width*height;
        System.out.println("Cuboid integer:");
        print();
    }

    Volume (double edge) {
        volume = edge*edge*edge;
        System.out.println("Cube double:");
        print();
    }

    Volume (int edge) {
        volume = edge*edge*edge;
        System.out.println("Cube integer:");
        print();
    }

    void print(){
        System.out.println("Volume: "+volume);
    }
}

public class Box {

    public static void main(String[] args) {
        Volume Box1 = new Volume(12);
        Volume Box2 = new Volume(15.85);
        Volume Box3 = new Volume(10, 10, 10);
        Volume Box4 = new Volume(10.56, 16.30, 21.68);
    }

}
