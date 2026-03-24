public class TwoSum
{
    public static void main(String[] args)
    {
        int[] arr= { 3,2,4};
        int tar= 6;
        boolean ans = two(arr,tar);
        System.out.println("found: " + ans);
    }

    public static boolean two(int[] a, int target)
    {
        int left = 0;
        int right = a.length-1;
        int sum =0;
        while(left<right)
        {
            sum = a[left] + a[right];
            if(sum == target)
            {
                return true;
            }
            else if(sum>target)
            right--;
            else
            left++;
        }
        return false;
    }
}
