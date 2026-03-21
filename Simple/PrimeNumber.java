import java.util.*;
public class PrimeNumber
{    
    public static void primeNum(int n)
    {
        int count = 0;
        for(int i = 1; i<= Math.sqrt(n); i++)
        {
            if(n % i ==0)
            {
                count ++;
                if(n/i != i)
                count ++;
            }
        }
        if(count >2)
        System.out.println("NOT PRIME");
        else
        System.out.println("PRIME");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrimeNumber.primeNum(n);
 
    }
}
