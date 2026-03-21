import java.util.*;

public class Armstrong 
{
    public static void main(String args[])
    {
        int n = 153;
        int sum = 0;
        int temp = n;
        while(n>0)
        {
            int r = n % 10;
            sum = sum + ( r * r * r);
            n = n/10;
        }
        if(temp == sum)
        {
            System.out.print("armstrong");
        }
    }
}