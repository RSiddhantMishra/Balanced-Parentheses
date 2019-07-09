import java.io.*;
import java.util.*;
import java.lang.*;
class paranthesis
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        char[] str=st.toCharArray();
        int len=st.length();
        int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0;
        for(int i=0;i<len;i++)
        {
            if(str[i]=='(')
            {
                a1++;
            }
            else if(str[i]==')')
            {
                a2++;
            }
            else if(str[i]=='[')
            {
                b1++;
            }
            else if(str[i]==']')
            {
                b2++;
            }
            else if(str[i]=='{')
            {
                c1++;
            }
            else if(str[i]=='}')
            {
                c2++;
            }
        }
        if(a1>a2)
        {
            System.out.println(a1-a2+" times ) is missing");
        }
        else if(a2>a1)
        {
            System.out.println(a1-a1+" times ( is missing");
        }
        if(b1>b2)
        {
            System.out.println(b1-b2+" times ] is missing");
        }
        else if(b2>b1)
        {
            System.out.println(b2-b1+" times [ is missing");
        }
        if(c1>c2)
        {
            System.out.println(c1-c2+" times } is missing");
        }
        else if(c2>c1)
        {
            System.out.println(c2-c1+" times { is missing");
        }
        if(c1==c2 && a1==a2 && b1==b2)
        {
            System.out.println("All are equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}


