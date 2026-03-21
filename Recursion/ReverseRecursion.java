public class ReverseRecursion
{
    public static void main(String args[])
    {
        int s = 1092839;
        int last = 0;
        ReverseRecursion.revNo(s,last);
       
    }
    public static void revNo(int n,int last)
    {
        if(n==0)
        {
                System.out.print(last);
                return ;
        }
        
        int rem = n%10;
        last = last * 10 + rem;
        revNo(n/10,last);   
        
    }
}