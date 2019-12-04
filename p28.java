import java.io.*;
import java.util.*;
import java.lang.*;
class P28
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
char a=hr.next().charAt(0);
if(a=='R')
System.out.println("Red");
else if(a=='B')
System.out.println("Blue");
else if(a=='G')
System.out.println("Green");
else if(a=='O')
System.out.println("Orange");
else if(a=='Y')
System.out.println("Yellow");
else if(a=='w')
System.out.println("White");
else
{
System.out.println("invalid");}
}
}