import java.util.*;
public class SlidingWindowK
{
    public static void main(String args[])
    {
        int max = 0;
        int cur = 0;
        int k = 3;
        int[] a = {2,31,1,23,0,90};

        for(int i=0;i<k;i++)
        cur += a[i];

        max = cur;
        int startIndex = 0;
        int[] b= new int[k];
        for(int i=1;i<=a.length-k;i++)
        {
            cur = cur-a[i-1]+a[i+(k-1)];
            
            if(cur>max)
            {
                startIndex = i;
                max = cur;
                           
            }
            
        }
        int j=0;
        for(int i=startIndex;i<startIndex+k;i++)
        {
            b[j++] = a[i];
        }
        System.out.print(Arrays.toString(b));
    }
}