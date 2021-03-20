package p1;

public class InsideClass
{

    private int pri_var = 10;
    public  int pub_var = 11;
    protected int pro_var = 12;
    int def_var = 13;
    void display()
    {
        System.out.println("Private variable: "+pri_var);
        System.out.println("public variable: "+pub_var);
        System.out.println("protected variable: "+pro_var);
        System.out.println("default variable: "+def_var);
    }
}
