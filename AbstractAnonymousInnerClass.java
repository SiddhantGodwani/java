abstract class Car{
    public abstract void fly();
}
// class Tesla extends Car{
//     public void fly(){
//         System.out.println("FLYyyyyyyyyyyyyyyyyyy");
//     }
// } 
public class AbstractAnonymousInnerClass 
{
    public static void main(String[] args){
        
        Car obj = new  Car() // object created is not of abstract class Car but of its inner class 
        {// anonymous inner class created to dedclare abstract methods 
            public void fly() // providing the implementation here itself
            {
                System.out.println("FLYyyyyyyyyyyyyyyyyyy");
            }
            // multiple abstract methods can be defined here as well

        };
        obj.fly(); 
    }
}
