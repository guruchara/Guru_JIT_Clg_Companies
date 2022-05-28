import java.util.Scanner;
import java.util.*;
public class sebone
{

    public static int check(int a[])
    {        
        int sum=0;
       int i=0;
        HashSet<Integer>h=new HashSet<Integer>();
        for(i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }

         int j=0;
        for(int val:h)
        {
            int c=0;
            for(i=0;i<a.length;i++)
            {
               if(val==a[i])
               {
                   c++;
               }
            }  
            if(c>1)          
            {
                sum+=val;
            }
        }

        Arrays.sort(a);
        int ans = 1;
        for(int k : a){
            if(k == ans) ++ans;
        }        
        return ans+sum;        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(check(a)); 
    }
}