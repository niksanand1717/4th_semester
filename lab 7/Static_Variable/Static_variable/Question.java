class Initialize {

    static int a = 0;

    Initialize() {
        a++;
        print();
    }

    void print() {
        System.out.println("Value of a: "+this.a);
    }
}


public  class Question {
    public static void main(String[] args) {
        Initialize obj1 = new Initialize();
        Initialize obj2 = new Initialize();
        Initialize obj3 = new Initialize();
    }
}
