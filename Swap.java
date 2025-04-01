import java.io.*;
class Swap
{
public static void main(String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Swapping two integer");
System.out.println("---------------------");
System.out.println("Enter the a value=");
String s1=br.readLine();
int a=Integer.parseInt(s1);
System.out.println("Enter the b value=");
String s2=br.readLine();
int b=Integer.parseInt(s2);
System.out.println("----------------------");
System.out.println("Before swapping a="+a+",b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping a="+a+",b="+b);
}
catch(Exception e)
{
System.out.println("error"+e.getMessage());
}
}
}