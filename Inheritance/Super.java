public class Main {
    public static void main(String[] args) {
       // Vehicle v=new Vehicle();
       // v.color="Blue";
        // v.print();// v.print();//Vehicle ka print call hoga




        //When we make object of derived class ,parent class ka object bhi create hota hai
        //Parent Class ka constructor +Base class ka constructor call hoga
        Car c=new Car(5,100);
        c.color="Black";
        c.setmaxspeed(100);
    }
}

//Base Class,Parent,Super
class Vehicle {
   protected String color;
    private int maxspeed;

    public Vehicle(int maxspeed){
        this.maxspeed=maxspeed;
        System.out.println("Vehicle Constructor");
    }

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

    public Car(int numGears,int maxspeed){
        super(maxspeed);
        this.numGears=numGears;
        System.out.println("Car Constructor");
    }

    public void print(){

        super.print();//To access function of parent class

        System.out.println("Car Gears==>" + numGears);
        System.out.println("Car Convertible==>" + isConvertible);

    }

}
/* Important

When we create a car object a vehicle object was getting created.
It tries to call the default constructor.

Now since vehicle constructor is parameterised, default constructor is gone so now vehicle constructor cannot be called
as we now have to pass maxspeed to it which cannot be done when car object is created and it cannot the value automatically.

Now we can use super [super(100)]==>In car constructor we can use this statement and maxspped will be passed to vehicle class.
Another way take maxspeed input in car constructor and send that value through suoer.

If deafault constructor in Vehicle is present no need for above.

 */
