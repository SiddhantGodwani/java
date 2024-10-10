//#66 interfaces ini java

// intereface dont have their own memory in the heap so hence no non final variables possible
//and static as we have to use the intereface name

// Decided at design time-> classes, abstrct classes,heirarchy .
//interface is used when we have an abstract class that implements only abstract methods
// interface is not a class
//its instance can be created but not an object
//to create an object of instance we have to use a class that implements(inherits)
//that interace
//here implements is used insteadof extends
// variables in interface are always final & static and have to be defind there
////////////////////////////////////////////////////////////////

// abstract class A
// {  //abstract class with only abstract methods
//     public abstract void show();
//     public abstract void config();
//     public abstract void refresh();
//}
interface B 
{
    int A= 23;  // Final & static hence cannot be change 
    String S = "a";  // & can be called via class name
    // String y; will give error as its static & not defined yet 
    
    //All the methods are by default public abstract 
    void show(); // can also be written as "public abstract void show();"" without issue 
    void config();
    // void refresh();
    // public abstract void roll(); // same as "void roll();" in interface
}
//concrete class 
class C implements B  // all methods of interface should be implemented here compulsarily
{
    public void show()
    {
        System.out.println("Show ");
    }

    public void config()
    {
        System.out.println("config");
    }

    // public void refresh()
    // {
    //     System.out.println("refresh");
    //}

    // public void roll()
    // {
    //      no need to actually do smtg
    // }
}

public class Interface
{
    public static void main(String[] args) {
        //B obj = new B(); you cant create object of B (interface)
    B obj=new C();  //But you can create object of C (Class) 
    obj.show(); 
    obj.config(); 
    System.out.println(B.A); //called final variable via class name
    System.out.println(B.S);
    // B.A = 19; -> wont fork as its a final field hence cannotbe altered
    }
    
} 