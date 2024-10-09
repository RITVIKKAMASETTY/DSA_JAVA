import java.util.*;
public class majorelement1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        int d=b[a-1]+1;
        int c[]=new int[d];
        for(int i=0;i<a;i++)
        {
            c[b[i]]=c[b[i]]+1;
        }
        for(int i=0;i<d;i++)
        {
            if(c[i]>(a/2))
            {
                System.out.println(i);
            }
        }
    }
}
// import java.util.*;
// public class javap
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b[]=new int[a];
//         for(int i=0;i<a;i++)
//         {
//             b[i]=sc.nextInt();
//         }
//         int c=b[0];
//         int d=0;
//         for(int i=0;i<a;i++)
//         {
//             if(c==b[i])
//             {
//                 d=d+1;
//             }
//             else if(c!=b[i])
//             {
//                 d=d-1;
//             }
//             if(d==0)
//             {
//                 c=b[i];
//             }
//         }
//         System.out.println(c);
//     }
// }