import java.util.*;
public class SlidingWindowMaxElem
{
    public static void main(String args[])
    {
        int k = 1;
        
        int[] a = {1,-1};
        int[] b = new int[a.length-k+1];
        int l=0;
        for(int i=0;i<=a.length-k;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+(k);j++)
            {
                if(a[j]>max)
                {
                 max=a[j];
                }
                else
                continue;
           }
           b[l++]=max;
           
        }
        System.out.print(Arrays.toString(b));
    }
}