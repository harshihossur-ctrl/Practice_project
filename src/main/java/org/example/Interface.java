package org.example;

interface Shape
{
    int length=10;  //final & static
    int width=20;   //final & static

    void circle();  //abstract method

    default void square()
    {
        System.out.println("this is square - default method");
    }

    static void rectangle()
    {
        System.out.println("this is rectangle - static method");
    }
}

public class Interface implements Shape
{
    public void circle()
    {
        System.out.println("this is circle - abstract method");
    }

    public static void main(String[] args)
    {
        //Scenario 1
        /*Interface idobj=new Interface();
        idobj.circle(); //abstract method
        idobj.square(); //default method
        Shape.rectangle();  //static method can directly access from interface*/

        //Scenario 2
        Shape sh=new Interface();
        sh.circle();
        sh.square();
        Shape.rectangle();

    }

}
