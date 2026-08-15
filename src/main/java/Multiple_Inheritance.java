interface I1
{
    int x=100;
    void m1();
}
interface I2
{
    int y=200;
    void m2();
}
class C2
{
    int z=300;
    void m3()
    {
        System.out.println(z);
    }
}

public class Multiple_Inheritance extends C2 implements I1, I2
{
   public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }
    public static void main(String[] args)
    {
        Multiple_Inheritance mi=new Multiple_Inheritance();
        mi.m1();
        mi.m2();
        mi.m3();
    }
}
