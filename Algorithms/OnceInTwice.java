import java.util.*;
public class OnceinTwice
{
    public static void main(String args[])
    {
        int[] a = {1,1,2,2,3,4,4,5,5};
        int[] h = new int[a.length];
        for(int i=0 ;i <a.length;i++)
        {
            h[a[i]] += 1;
          
        }
          for(int i=0 ;i <a.length;i++)
        {
            if((h[a[i]]) == 1)
            System.out.print(a[i]);
          
        }
    
        System.out.print(Arrays.toString(h));
    }
}