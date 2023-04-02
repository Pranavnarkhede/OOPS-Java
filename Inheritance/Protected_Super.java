
//Protected and Super
//With Protected we can access outside package in any subclass which is inherited

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

        // Truck t=new Truck();
        //t.color="Green";
        //t.print();



    }
}

//When Data members is Private
//Base Class,Parent,Super
class Vehicle {
   protected String color;
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
//Derived Class,Child Class,Subclass
class Car extends Vehicle{
    int numGears;
    boolean isConvertible;

    public void print(){
        
        super.print();//To access function of parent class 
        
        System.out.println("Car Gears==>" + numGears);
        System.out.println("Car Convertible==>" + isConvertible);

    }

}
/*
class Truck extends Vehicle{
    int load_Cap;

    public void print(){
        System.out.println("Truck Loading capacity==>"+load_Cap);
        System.out.println("Truck Speed=>"+getmaxspeed());
        System.out.println("Truck Color==>"+color);
    }

}


Output:
Vehicle Color==>Blue
Vehicle Speed==>0
Vehicle Color==>Black
Vehicle Speed==>0
Car Gears==>10
Car Convertible==>false
Vehicle Color==>Black
Vehicle Speed==>100
Car Gears==>10
Car Convertible==>false
*/
