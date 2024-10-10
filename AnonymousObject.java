//Anonymous Object= Cannot be Reused

class Show{

    public Show(){
        System.out.println("Constructor Called");
    }
    public void pri(){
        System.out.println("Method Called");
    }
}


public class AnonymousObject {
    public static void main(String args[])
    {   // Only blank object is created in heap
        new Show();   // Anonymous object created== only constrructor will be called

    // One step declaration
        Show obj = new Show();   // Referenced object created== constrructor will be called

        new Show().pri();   // Anonymous object used (once) = Constructor, Method both called
        new Show().pri();   // if called Twice 2nd object will be created
        
    // Two step declaration of Object
        Show obj1;  
        obj1 = new Show(); // comstructor called
        obj1.pri();  // Method called

    } 
}
