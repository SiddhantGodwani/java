// Abstraction restricts creation of its objects
// 1.Abstract methods can not be called via an object directly,
//   so we need to create a new subclass to call or use abstract methods
// CANNOT create objects of abstract class but can create instance of it

// 2.Abstract methods can only be declared in an abstract class and
//   an abstract class may contain normal methods as well.
// 3.Abstract methods are used when you wish to delare the method first but do not want to
//   declare its features/ workings yet
// 4.These features can then be defined later in a derived class that extends the 
//   abstract class.
// 5. A derived class of an abstract class must always define its abstract methods  

//car is just an abstract concept
abstract class Car //Abstract class
{  
    // abstract method declared in abstract class
    public abstract void drive1(); //the method is only declared but not DEFINED yet
    // public abstract void drive2(); //the method is only declared but not DEFINED yet

    public void show()
    {//Noral method defined in the abstract class
        System.out.println("IN show");
    }
}

// This class is solely created for the purpose of using
// the abstract method of it parent class
class NissanCar extends Car // Concrete class
{
    public void drive1() // overrides the abstract method feature
    {
        System.out.println(" IN Car");
    }   
}

public class Abstration 
{
        public static void main(String[] args)
    {
        Car obj = new NissanCar();
        obj.drive1(); // will call drive method of sub class via dynamic method dispach 
        obj.show();


        // THIS CAN ALSO BE DONE BY USING ANONYMOUS ABSTRACTION
        // Car obj2 = new NissanCar()
        // {
        //     public void drive2()
        //     {
        //         System.out.println("IN Car2");
        //     }
        // };
        // obj2.drive1();
    }
}

