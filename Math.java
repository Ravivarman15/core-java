import java.io.*;
class Math
{
public static void main(String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("sum of number");
System.out.println("---------------");
System.out.println("enter the n value:");
String s1=br.readLine();
int n=Integer.parseInt(s1);
System.out.println("result:");
int a=n*(n+1)/2;
System.out.println("sum of value: "+a);
int b=n*(n+1)*(2*n+1)/6;
System.out.println("sum of square: "+b);
int c=(n*(n+1)/2)*2;
System.out.println("sum of cube: "+c);
System.out.println("---------------");
}
catch(Exception e)
{
System.out.println("error"+e.getMessage());
}
}
}