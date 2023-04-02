//Final Keyword
//This keyword
//Static


public class Main {
    public static void main(String[] args) {

Student s1=new Student();//Roll Number Set when object declared
System.out.println(s1.getRollNumber());

        Student s2=new Student("Pranav");
        System.out.println(s1);
        s2.Print();
        Student s3=new Student("Ankush");
        System.out.println(s3);
        s3.Print();
//Ouput of This and s1 will be same
        
         System.out.println(s1.numsStudent);
        System.out.println(s2.numsStudent);
        System.out.println(Student.numsStudent);//Better way to call


}
    }
public class Student {
    public String name;

    //Final Data Member Can be initialised when declared
    //Can be declared initially or only in Constructor kyuki declaration ke waqt he constructor invoke hota hai
    private final int rollNumber=100;
    
     //For one data to be shared among all not separate
     static int numsStudent; //To get no of objects created,Once all objects are created everyone should return only one value so separate numsStudent for each class is not required
                             //Ek he numsStudent for all Classes
                            //Should make private so that value should not change

    public Student(){
        name="";
       // rollNumber=100;
    }

    //Acces data members which has same name as local variable
    public Student(String name){
        System.out.println(this);
        this.name = name; //Now this is the object jisko ham construct kar rahe hai
                          //Use this to get object which us called
        numsStudent++;
    }

    public int getRollNumber(){
        return  rollNumber;
    }


    /*
    Throws error as cannot set Value to Roll Number
    public void setRollNumber(int rn){
        rollNumber=rn;
    }
    */

    public void Print(){
        System.out.println(name+" "+rollNumber);
    }
}



 /*Ouput
    100
Student@7b23ec81
Student@6acbcfc0
Pranav 100
Student@6f496d9f
Student@6f496d9f
Ankush 100
2
2
2
     */
