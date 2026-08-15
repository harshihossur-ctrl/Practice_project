public class Decrement
{
    public static void main(String[] args)
    {
        int a=10;
        a=a-1;
        System.out.println(a);

        //Post decrement
        int b=10;
        int res=b--;
        System.out.println(res);
        System.out.println(b);

        //Pre decrement
        int c=10;
        int resl=--c;
        System.out.println(resl);
        System.out.println(c);

    }
}
