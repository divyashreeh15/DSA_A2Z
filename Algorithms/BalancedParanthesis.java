import java.util.*;
public class BalancedParanthesis
{
    public static void main(String args[])
    {
        String str = "[(){}][]{()}";
        boolean flag = true;
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray())
        {
            
            if(c == '{' || c == '(' || c == '[' )
            s.push(c);
            else if( c == '}' || c == ']' || c == ')' )
            {
                if(s.isEmpty()){ flag = false; break;}
                char top = s.pop();
                if( top != '(' && c== ')' ||
                top != '{' && c== '}' ||
                top != '[' && c== ']' )
                {
                    flag = false;
                    break;
                }
                
                
            }
            else
            {
                System.out.print("not a paranthesis");
                break;
            }
          
        }
         if(!s.isEmpty())
            flag = false;

        
        System.out.print(flag);
    }
}