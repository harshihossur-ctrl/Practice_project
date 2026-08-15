import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice_Java_prgms
{
    private int accno;
    private String name;
    private double amount;

    void setAccno(int accno)
    {
        this.accno=accno;
    }
    int getAccno()
    {
        return accno;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setAmount(double amount)
    {
        this.amount=amount;
    }
    double getAmount()
    {
        return amount;
    }


    public static void main(String[] args)
    {
        Practice_Java_prgms p1=new Practice_Java_prgms();
        p1.setAccno(101);
        p1.setName("john");
        p1.setAmount(15000);

        System.out.println(p1.getAccno());
        System.out.println(p1.getName());
        System.out.println(p1.getAmount());
    }

    }


