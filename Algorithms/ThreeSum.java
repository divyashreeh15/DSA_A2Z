import java.util.*;
public class ThreeSum
{
    public static void main(String args[])
    {
        int[] a = {-4,-1,-1,0,1,2};
        Arrays.sort(a);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<a.length-2;i++ )
        {
            if(i>0 && a[i] == a[i-1] )continue;
            int l=i+1;
            int r = a.length-1;
            while(l<r)
            {
                int sum = a[i]+a[l]+a[r];
                if(sum == 0)
                {
                    List<Integer> trip = new ArrayList<Integer>();
                    trip.add(a[i]);
                    trip.add(a[l]);
                    trip.add(a[r]);
                    result.add(trip);

                    while( l<r && a[l] == a[l+1])l++;
                    while( l<r &&  a[r] == a[r-1])r--;

                    l++;
                     r--;
                }
                else if(sum<0)
                l++;
                else
                r--;
                
            }
        }

        System.out.print(result);
    }
}