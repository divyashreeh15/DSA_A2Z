//Hash Map

public class TwoSumUnsorted
{
    public static void main(String args[])
    {
        int[] a = {3,4,6};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            int sub = target - a[i];
            if(map.containsKey(sub))
            {
                return new int[]{map.get(sub),i};
            }
            map.put(a[i],i);
        }
        
    }
}