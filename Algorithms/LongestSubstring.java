import java.util.*;
public class LongestSubstring
{
    public static void main(String args[])
    {
        String a = "abcdeabcdefght";
        char[] c = a.toCharArray();
        int l=0,r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0,cur=0;
        while(r < c.length)
        {
            if(map.containsKey(c[r]))
            {
                l = map.get(c[r])+1;
            }
            map.put(c[r],r);
            cur = r-l+1;
            max = Math.max(cur,max);
            r++;
        }
        System.out.println(max);
    }
}