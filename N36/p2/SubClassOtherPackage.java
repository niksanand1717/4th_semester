package p2;

import p1.*;

public class SubClassOtherPackage extends InsideClass{
    public static void main(String[] args) {
        SubClassOtherPackage obj = new SubClassOtherPackage();
        System.out.println("Demonstration of all access specifiers in Sub Class of Other Package:-");
        System.out.println("Here private variable ['pri_var'] is not accessible");
        System.out.println("Here default variable ['def_var'] is not accessible");
        System.out.println("Public Variable: "+obj.pub_var);
        System.out.println("Protected Variable: "+obj.pro_var);
    }
}
