import java.util.*;
public class SumOFRecursion
{
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sumRecur(n));
    }
    public static int sumRecur(int n)
    {
        if(n==0)
        return 0;
        return n + sumRecur(n-1); 
    }
}