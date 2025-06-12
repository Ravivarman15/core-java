import java.io.*;

public class Main {
    public static void main(String args[]) {
public class Car {
    String name;
    String color;
    int year;

    // Constructor to initialize the attributes
    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    public void Details() {
        System.out.println("Car model: " + name);
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
    }
}

        // Creating an object of the Car class
        Car myCar = new Car("Benz", "White", 2001);

        // Calling the Details method on the myCar object
        myCar.Details();
    }
}
