import java.util.*;
public class stairs1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(count(a));
    }
    public static int count(int a)
    {
        if(a==0||a==1)
        {
            return(1);
        }
        int b=count(a-1)+count(a-2);
        return(b);
    }
}
