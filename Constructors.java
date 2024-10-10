//Constructor:
            //Parametrised Constructor
            //Default Constructor

class Constructor
    {   
         int x;
         int y;

        public Constructor()  //Default constructor
        {
            System.out.println("Default Constructor called");
        }

        //Method 1
        public Constructor(int x, int y)  // parametrised constructor
        {
            this.x=x;
            this.y=y;
            
            System.out.println(x+":"+y);
            System.out.println("Parametrised Constructor called");
        }
        
        //........................OR........................................
        //Method 2
        // public Constructor(int a, int b)  // parametrised constructor
        // {
        //     x=a;
        //     y=b;
            
        //     System.out.println(x+":"+y);
        //     System.out.println("Parametrised Constructor called");
        // }
    
    } 

public class Constructors
{   
    public static void main(String Args[]){

        Constructor obj = new Constructor();   //only calls default constructor as it is created

        Constructor obj1 = new Constructor(2,3);    //Passes values to the parametrised constructor

        System.out.println(obj);  //idk whaat it calls but it says Constructor@5b2133b1
        System.out.println(obj1.x+":"+obj1.y);

    }

}