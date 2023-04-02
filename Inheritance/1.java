//Inheritance
//When there are some specific property available in every Class ,we avoid writing these property in every class


public class Main {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.color="Blue";
        v.print();

        Car c=new Car();
        c.numGears=10;
        c.color="Black"; //As it extends properties of color
        c.print();       //Function of Vehicle
        c.printCar();

    }
}

//When Data members are public
class Vehicle {
    String color;
    int maxspeed;

    public void print() {
        System.out.println("Vehicle Color==>" + color);
        System.out.println("Vehicle Speed==>" + maxspeed);

    }
}
//Car can now all properties of Vehicle
class Car extends Vehicle{
    int numGears;
    boolean isConvertible;

    public void printCar(){
        System.out.println("Car Color==>" + color);
        System.out.println("Car Speed==>" + maxspeed);
        System.out.println("Car Gears==>" + numGears);
        System.out.println("Car Convertible==>" + isConvertible);

    }

}

/*
Output:
Vehicle Color==>Blue
Vehicle Speed==>0
Vehicle Color==>Black
Vehicle Speed==>0
Car Color==>Black
Car Speed==>0
Car Gears==>10
Car Convertible==>false


*/
