import java.util.*;
public class RevArrayRecursion
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,6,8};
        int[] w = reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArray(int[] arr,int s, int e)
    {       
        if(s>e)
        return arr;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        
        return reverseArray(arr,(s+1),(e-1));
    }
}