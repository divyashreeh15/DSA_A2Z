public class FibonacciRecursion
{
    public static void main(String[] args)
    {
        int n = 6;
        System.out.println("Fibonacci number at "+ n +" is= "+ FibonacciRecursion.recursion(n) );
    }

    public static int recursion(int n)
    {
        if(n<2)
        {
            return n;
        }
        return recursion(n-1) + recursion(n-2);
    }


}
