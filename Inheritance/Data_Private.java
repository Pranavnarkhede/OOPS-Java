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

        //Car is able to access maxspeed because of getmaxspped and getmaxspped can access maxspeed
        c.setmaxspeed(100);
        c.printCar();


    }
}

//When Data member is Private
class Vehicle {
    String color;
    private int maxspeed;

    //Use getter setter to get maxspeed
    public int getmaxspeed(){
        return maxspeed;

    }
    public  void  setmaxspeed(int maxspeed){
        this.maxspeed=maxspeed;
    }

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
        System.out.println("Car Speed==>" + getmaxspeed());
        System.out.println("Car Gears==>" + numGears);
        System.out.println("Car Convertible==>" + isConvertible);

    }

}
