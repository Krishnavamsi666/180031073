import java.io.*;
import java.util.*;
class Palindrome
{
public static void main (String agrs[])
{
int n,num,r,i,sum=0;
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
n=num;
while(n!=0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(sum==num)
{
System.out.println(num+"it is palindrome");
}
else 
{
System.out.println(num+"it is not palindrome");
}
}
}