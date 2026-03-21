import java.util.*;
public class ArrayInsert
{
    public static void main(String args[])
    {
        String[] a = {"BAB","rap","lap"};
        int n = 1;
        String s = "cap";
        insertMid(s,n,a);

    }
    public static void insertMid(String s, int n, String[] a)
    {
        String[] b = new String[a.length + 1];
        for(int i =0;i<n;i++)
        {
            b[i]= a[i];
        }
        b[n]=s;
        for(int i= n+1;i<b.length;i++)
        {
                b[i] = a[i-1];
        }
        System.out.print(Arrays.toString(b));
    }
}