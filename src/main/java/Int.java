interface Shapes
{
    int length=10;
    int width=20;

    void circle();  //abstarct method

    default void square()
    {
        System.out.println("this is square -default method");
    }
    static void rectangle()
    {
        System.out.println("this is rectangle - static method");
    }

}

public class Int implements Shapes
{
    public void circle()
    {
        System.out.println("this is circle - abstract methos");
    }

    public static void main(String[] args) {
        Int it=new Int();
        it.circle();
        it.square();
        Shapes.rectangle();
    }
}
