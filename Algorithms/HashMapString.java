import java.util.*;
public class HashCharacter
{
    public static void main(String args[])
    {
        //Count alphabets 
        String s = "zxyabc";
        HashMap<Character,Integer> h  = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
           if(h.containsKey(s.charAt(i)))
           h.put(s.charAt(i),h.get(s.charAt(i))+1);
           else
           h.put(s.charAt(i),1); 
        }
        System.out.print(h);
    }
}