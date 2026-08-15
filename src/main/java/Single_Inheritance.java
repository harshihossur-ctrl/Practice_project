import org.checkerframework.checker.units.qual.A;

import javax.swing.*;
class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("eating bread");
        super.eat();
    }
}
public class Single_Inheritance
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();

    }
}
