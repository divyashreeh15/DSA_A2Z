import java.util.*;
public class HashCharacter
{
    public static void main(String args[])
    {
        //Count alphabets 
        String s = "abcabcabc";
        int a[] = new int[26];
        for(int i =0;i<s.length();i++)
        {
            a[s.charAt(i) - 'a'] +=1;
        }
        System.out.print(Arrays.toString(a));
    }
}