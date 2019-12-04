import java.io.*;
import java.util.*;
class P25
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if(a>=65 && a<= 122)
{
System.out.println("alphabets");
}
else if(a>=48 && a<=57)
{
System.out.println("integers");
}
else{
System.out.println("special characters");
}
}}

