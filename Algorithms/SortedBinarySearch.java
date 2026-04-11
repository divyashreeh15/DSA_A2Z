public class SortedBinarySearc
{
    public static void main(String args[])
    {
        int[] a = {7,8,9,1,2,3,4,5,6};
        int target = 1;
        int low = 0;
        int high = a.length-1;
        while(low<=high)
        {
         
         int mid = low + (high - low) / 2;
         if(a[mid] == target)
         {
            System.out.print(mid);
            break;
         } 
         if(a[low] <= a[mid]) ///left array is sorted
         {
            if(target < a[mid] && target >= a[low])
            high = mid - 1;
            else
         low = mid + 1;
                      
         }
         else
         {
             if(target > a[mid] && target <= a[high])
             low = mid +1;
             else
             high = mid -1;

         }

        }

     }
    
}