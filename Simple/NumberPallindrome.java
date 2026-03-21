public class Count
{
    public static void main(String args[])
    {
        int num = -191;
        int temp=num;
        int ans = 0;
        int rem = 0;
        while(num > 0)
        {
           rem = num%10; 
           ans = ans * 10 + rem; 
           num = num/10; 
        }
         
        if(temp == ans)
         System.out.println("Pallindrome");
    }
}