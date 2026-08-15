public class Ternary
{
    public static void main(String[] args)
    {
        int a=100, b=200;
        int res=(a>b)?a:b;
        System.out.println(res);

        int x=(1==1)?100:200;
        System.out.println(x);

        int person_age=25;
        String resl=(person_age>=30)? "Eligibile" : "Not eligible";
        System.out.println(resl);

    }
}
