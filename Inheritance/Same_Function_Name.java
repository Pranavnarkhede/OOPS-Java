//Inheritance
//When there are some specific property available in every Class ,we avoid writing these property in every class


//Same Function Name in Both Base and derived Classes
public class Main {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.color="Blue";

        v.print();//Vehicle ka print call hoga

        Car c=new Car();
        c.numGears=10;
        c.color="Black"; //As it extends properties of color
        c.print();       //Function of Vehicle

        //Car is able to access maxspeed because of getmaxspped and getmaxspped can access maxspeed
        c.setmaxspeed(100);

        c.print();//First Check in Car Class Print hai kya agar hai toh vo call hoga
                  //Agar nahi hai to uske base class ya parent class pe jayegha aur check karegha print hai kya



    }
}

//When Data members is Private
//Base Class
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
//Derived Class
class Car extends Vehicle{
    int numGears;
    boolean isConvertible;

    public void print(){
        System.out.println("Car Color==>" + color);
        System.out.println("Car Speed==>" + getmaxspeed());
        System.out.println("Car Gears==>" + numGears);
        System.out.println("Car Convertible==>" + isConvertible);

    }

}
