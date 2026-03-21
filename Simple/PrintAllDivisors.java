import java.util.*;
public class PrintALLDivisors
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintALLDivisors.Divisors(n);

    }
    public static void Divisors(int n)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for(int i=1;i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
               arr.add(i);
               if(n / i != i)
                {
                    arr.add(n/i);
                }
            }    
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
}