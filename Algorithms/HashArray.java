import java.util.*;
public class HashArray
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,1,2,3,1,2,3,4};
        int[] h = new int[10000000000];
        for(int i =0;i<arr.length;i++)
        {
            h[arr[i]] += 1;
        }

       
    }
}