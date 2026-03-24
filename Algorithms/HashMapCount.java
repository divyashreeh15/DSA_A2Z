import java.util.*;
public class HashMapCount
{
    public static void main(String args[])
    {
        int[] a = {1,2,3,1,2,3,1,2,3,4};
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {   
            if(h.containsKey(a[i]))
        h.put(a[i],h.get(a[i])+1);
        else
        h.put(a[i],1);        
        //  h.put(a[i],h.getOrDefault(a[i],0)+ 1);
        }
        

        //h.put(a[i],h.get(a[i]+1))
        

        System.out.print(h);
    }
}