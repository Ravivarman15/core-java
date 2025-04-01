import java.io.*;
class Rightangle
{
public static void main(String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Right angle triagle:");
System.out.println("---------------------");
System.out.println("enter the number of rows for the pyramid:");
String s1=br.readLine();
int n=Integer.parseInt(s1);
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.println("*");
}
System.out.println();
}
}
catch(Exception e)
{
System.out.println("Error "+e.getMessage());
}
}
}