import java.io.*;
import java.util.*;
class Reverse
{
public static void main(String[] agrs)
{
int num,sum=0,r;
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
for( int i=0;i<=num;i++)
{
r=num%10;
sum=sum*10+r;
num=num/10;
i=0;
}
System.out.println("r.num\t"+sum);
}
}
