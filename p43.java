import java.io.*;
import java.util.*;
class Patient
{
String Patientname;
double weight,height;
Patient(String Patientname,double weight,double height);
{
this.Patientname=Patientname
this.weight=weight;
this.height=height;
}
double BMI()
{
double tot=0;
tot=(weight/(height*height))*703;
return tot;
}
}
class Patients
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
Double w = sc.nextDouble();
Double h = sc.nextDouble();
Patient p = new Patient();
System.out.println(p.BMI());
}
}