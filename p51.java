import java.io.*;
import java.util.*;
import java.lang.*;
class Author
{
private String name;
private String email;
private char gender;
Author(String name,String email,char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
}
String getName()
{
return name;
}
String getEmail()
{
return email;
}
char getGender()
{
return gender;
}
}



class Book
{
private String name;
private Author author;
private double price;
private int qtyStock;
String aname;
String aemail;
char gender;
Book(String name,double price,int qtyStock,String aname,String aemail,char gender)
{
this.name=name;
author=new Author(aname,aemail,gender);
this.price=price;
this.qtyStock=qtyStock;
}

String getName()
{
return name;
}
Author getAuthor()
{
return author; 
}
double getPrice()
{
return price;
}
void setPrice(double price)
{
this.price=price;
}
int getQtyStock()
{
return qtyStock;
}
void setQtyStock(int qtyStock)
{
this.qtyStock=qtyStock;
}
public static void main(String args[])
{
System.out.println("enter name ,price,quanty");
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
double b=sc.nextDouble();
int c=sc.nextInt();
System.out.println("enter author name , authoremail,gender");
String d=sc.nextLine();
String e=sc.nextLine();
char f = sc.next().charAt(0);
Book ob=new Book(a,b,c,d,e,f);
System.out.println(ob.getName());
System.out.println(ob.getAuthor().getName()+"  "+ob.getAuthor().getEmail()+"  "+ob.getAuthor().getGender());
}
}
