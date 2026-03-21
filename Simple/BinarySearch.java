public class BinarySearch
{
    public static void main(String args[])
    {
      int[] a = {10,20,40,44,46,78,321};
      BinarySearch.bs(a,0,a.length-1, 40);
    }
    public static void bs(int[] a, int s, int e, int target)
    {
        int mid = 0;
        while(s<=e)
        {        
        mid = s +(e-s) /2 ;
        if(a[mid] == target)
             break;
        
        if(target > a[mid])
        {
            s = mid+1;
        }
        if(target < a[mid])
                {
            e = mid-1;
        }
        
        }
    System.out.print(mid);
    }
}