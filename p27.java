import java.io.*;
import java.util.*;
class P27
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char s=sc.next().charAt(0);
if(Character.isLowerCase(s))
{
System.out.println(Character.toUpperCase(s));
}
else{
System.out.println(Character.toLowerCase(s));
}
}
}