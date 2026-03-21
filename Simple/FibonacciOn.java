public class Count
{
    public static void main(String args[])
    {
       int first = 0;
       int second = 1;
       int n = 0;
       int fib = 0;
       System.out.print(first + "  ");
       System.out.print(second + " ");
       while(n<5)
       {
        fib = first + second;
        first = second;
        second = fib;
        System.out.print(fib + " ");
         n++;
       }
    }

    public void fib(n)
    {
        int phi = (1 + Math.sqrt(5) )/2;
        System.out.println(Math.round(phi^n-1(-1/phi)*n)/Math.sqrt(5));

    }
}