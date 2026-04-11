import java.util.*;
public class NextGreater
{    
    public static void main(String args[])
    {
        int[] a = {1,12,3,4,20,19,22,2,1,33};
        NextGreater.NextGen(a);
    }
    public static void NextGen(int[] a)
    {
        Stack s = new Stack(a.length); 
        int nge[] = new int[a.length];
        nge[a.length-1] = -1;
        for(int i = a.length-1;i>=0;i--)
        {
            while( !s.isEmpty() && s.peek()<a[i])
            s.pop();

            if(s.peek() >= a[i]) nge[i]=s.peek();
            else
            nge[i] = -1;
            s.push(a[i]);
        }

        System.out.print(Arrays.toString(nge));
    }
}
class Stack 
{
    int top = -1;
      int s[];
    public Stack(int a)
    {
        s = new int[a];
    }

    public void push(int p)
    {
        if(top == s.length) System.out.print("full");
        else s[++top] = p;
    }
    public void pop()
    {
        if(top == -1) System.out.print("empty");
        else
        top--;
    }
    public int peek()
    {
        if(top == -1)return -1;
        return s[top];
    }

     public boolean isEmpty()
    {
        if(top ==-1)return true;
        else
        return false;
    }
}