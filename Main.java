import java.io.*;

public class Car{

String name;
String color;
int year;

public Car(String name,String color,int year){

this.name=name;
this.color=color;
this.year=year;
}

public class Details
{
System.out.println("Car model"+name);
System.out.println("Car color"+color);
System.out.println("Car year"+year);
}
}

public class Main
{
public static void main(String args[])
{
Car mycar=new Car("benz","white",2001);
mycar.Details();
}
} 
