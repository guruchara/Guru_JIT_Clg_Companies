import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){

         Scanner sc=new Scanner(System.in);

         int x=sc.nextInt();
         int y=sc.nextInt();

         int sum=x+y;

         int rem=sum/4; // 4 islie liya kyuki hme 4 se uske 

         // now we need to update the value of x and y
         x=x/rem;
         y=y/rem;

         System.out.println(x+y);
         return;
    }
}
