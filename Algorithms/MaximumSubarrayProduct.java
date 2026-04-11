public class MaximumSubarrayProduct
{
    public static void main(String args[])
    {
        int[] a = {-2,-5,-8};
        int p= 1;
        int s= 1;
        int i=0,j=a.length-1;
        int ans = Integer.MIN_VALUE;
        while(i<a.length && j>0)
        {
            if(p == 0) p=1;
            if(s ==0 ) s=1;
            p = p * a[i];
            s = s * a[j];
            ans = Math.max(ans, Math.max(p,s));
            i++;
            j--;
        }
        System.out.println(ans);
    }
}