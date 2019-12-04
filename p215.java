import java.util.*;
class P215
{
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Numbers : ");
        int n=sc.nextInt();
        int a=n;
        int s=0,sum=0;
        while(n!=0)
        {
              s=n%10;
              sum+=s;
             n/=10;
        }
         System.out.println("SUM : "+sum);
   }
}