
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        //For this default cpnstructor will be called
        Student s1=new Student(); //Space is been allocated for student class as well
                                  //Memory space for S1 which will store address of student class.
        Student s2=new Student();
        System.out.println(s1); // To verify
        System.out.println(s2);
        s1.name="Ankush";//Setting values
       // s1.rno=10;
        s2.name="Manisha";
       // s2.rno=11;


  //Private kiya tabhi bhi anyone can access or modify them but the control is within us
  //Control to enter positive roll no of any other
        s1.setRollNumber(10);//To print values
        s2.setRollNumber(11);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());

//For this parameterised Constructor wiil be called
        Student s3=new Student("Pranav",12);
        s3.Print();

        }
    }

class Student{


    //Acces Modifier
    //Default (Can be used within the package)
    //Public (Used anywhere)
    //Private (Can be accessed only in class)
    String name;
    private int rno;

    //Default Constructor
    public Student(){
        //Can also assign default values for variables
        name="";
        rno=0;
    }
    //Parameterised Constructor
    public Student(String s,int r){
        name = s;
        rno = r;

    }


    //To access private
    public void setRollNumber(int rn){
        if(rn<=0){
            return;
        }
        rno=rn;
    }
    public int getRollNumber(){
        return rno;
    }
public void Print(){
        System.out.println(name+"  "+rno);
}
 

}
