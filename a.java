import java.util.*;
public class a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b=a[0];
        int c=0,d=0;
        for(int i=1;i<5;i++)
        {
            if(b<a[i])
            {
                c=a[i]-b;
                d=Math.max(d,c);
            }
            else
            {
                b=a[i];
            }
        }
        System.out.println(d);}}
        import java.util.*;
public class a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b=a[0];
        int c=0,d=0;
        for(int i=1;i<5;i++)
        {
            if(b<a[i])
            {
                c=a[i]-b;
                d=d+c;
                b=a[i];
            }
            else
            {
                b=a[i];
            }
        }
        System.out.println(d);}}