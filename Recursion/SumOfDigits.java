public class SumOfDigits
{
    public static void main(String args[])
    {
        int n = 15;
        int j = SumOfDigits.SumOfDigitsRec(n);
        System.out.print(j);
    }
    public static int SumOfDigitsRec(int n)
    {
       
        if(n <= 0)
        return 0;
        
        return n % 10 + SumOfDigitsRec(n/10);
    }
}