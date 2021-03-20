package p1;

public class SubClassSamePackage extends InsideClass{
    public static void main(String[] args) {
        SubClassSamePackage ob = new SubClassSamePackage();
        System.out.println("Demonstration of all access specifiers in subclass of same package:- ");
        System.out.println("Here private variable ['pri_var'] is not accessible");
        System.out.println("Public Variable: "+ ob.pub_var);
        System.out.println("Protected Variable: "+ ob.pro_var);
        System.out.println("Default Variable: "+ ob.def_var);

    }
}
