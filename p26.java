import java.io.*;
import java.util.*;
class P26
{
public static void main(String[] args)
{
if(args[0].equals("male"))
{
int age =Integer.parseInt(args[1]);
if(age>=1 && age<=60){
System.out.println("interest=9.2%");
}
else if(age>=61 && age<=120)
{
System.out.println("interest=8.3%");
}
}
int age =Integer.parseInt(args[1]);
if(args[0].equals("female"))
{
if(age>=1 && age<=58)
{
System.out.println("interest=8.2%");
}
else if(age>=59 && age<=120)
{
System.out.println("interest=7.6%");
}
}
}
}

