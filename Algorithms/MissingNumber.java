import java.util.*;
public class MissingNumber
{
    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5,6,8};
        int n = a[a.length-1];
        int form =  n*(n+1)/2;
        int sum = 0;
        for(int s : a)
        {
            sum = sum + s;
        }
        System.out.print(form - sum );
    }
}