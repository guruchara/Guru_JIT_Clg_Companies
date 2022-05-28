import java.util.Scanner;

public class sebon1 {
 
    public static void check(int a[])
    {

        int c=0;

        int v=0;
       int i=0;
        while(i<a.length)
        {
            c++;
            v+=a[i];
            a[i]=v;
            i++;
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        check(a);
    }
}
