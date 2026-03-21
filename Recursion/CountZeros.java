public class CountZeros
{
    public static void main(String args[])
    {
        int n = 1020300000;
        int count = 0;
        int last = 0;
        countZero(n,count,last);
    }
    public static void countZero(int n,int count,int last )
    {
        if(n == 0)
        {
            System.out.println(count);
            return;
        }
        int rem = n % 10;
        if(rem == 0) count++;
        last = last * 10 + rem;
        countZero(n/10,count,last);
    }
}