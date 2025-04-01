import java.io.*;
class Details 
{
public static void main (String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("ravi international [p]ltd");
System.out.println("no:26,chennai");
System.out.println("----------");
System.out.println("salary bill receipt");
System.out.println("----------");
System.out.println("enter the employrr id:");
String s1=br.readLine ();
System.out.println("enter the employee name");
String s2=br.readLine ();
System.out.println("enter the salary");
String s3=br.readLine ();
int a=Integer.parseInt(s3);
System.out.println("INCOME:");
int b=a*20/100;
System.out.println("bonus 20% from sales:"+b);
int c=a*5/100;
System.out.println("overcome 5%:"+c);
int d=a*10/100;
System.out.println("increment 10%:"+d);
int e=a+b+c+d;
System.out.println("grand total:"+e);
System.out.println("expenditure");
int f=a*2/100;
System.out.println("LIC 2%:"+f);
int g=a*3/100;
System.out.println("HRA 3%:"+g);
int h=e-f+g;
System.out.println("net total:"+h);
}
catch(Exception e)
{
System.out.println("error:"+e.getMessage());
}
}
}