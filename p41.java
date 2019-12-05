import java.io.*;
import java.util.*;
class p41
{
int width,heigth,depth;
p41(double  width,double height,double depth)
{
this.width=width;
this.heigth=height;
this.depth=depth;
}
double volume()
{
double vol=0;
vol=width*height*depth;
return vol;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
p41 ob= new p41(a,b,c);
System.out.println("voulme of the given box is :"+ob.volume());
}
}


