import java.io.*;
class Sum
{
public static void main(String args[])
{
try
{
int sum=0;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("range:20-50");
System.out.println("divide by:3,5");
System.out.println("calculate sum:");
System.out.println("print the serious & sum");
for (int i=20;i<=50;i++)
{
if(i%3==0 || i%5==0)
{
System.out.println(i+"+");
sum=sum+i;
}
System.out.println(sum);
}
}
catch(Exception e)
{
System.out.println("error"+e.getMessage());
}
}
}