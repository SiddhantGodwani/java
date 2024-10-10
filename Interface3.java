// # 65 but should be 68 -> need for interface
// Tight coupling & Loose coupling
// it is good to "generalise" things instead of specializing it

// abstract class Computers // "generalising" things instead of specializing it
// {
//     public abstract void code();       // this has to be defined for lapton and 
/// both can be abstact or not.         //desktop to be overriding it
// }
// or

interface Computers // "generalising" things instead of specializing it
{
   void code();       // this has to be defined for lapton and 
// both can be abstact or not.         //desktop to be overriding it
}

class Developer
{
    public void Devapp(Computers lap)  // loose coupling
    {// dev obj is not dependent on lap or desk instead on ->>//*"Computer" */
        lap.code();
    }
}    

// class Developer
// {
//     public void Devapp(Laptop lap)  // Tight coupling
//     {
//         lap.code();
//     }
// }    

class Desktop implements Computers
{
    public void code()
    {
        System.out.println("code : compile : run-faster");
    }
}

class Laptop implements Computers
{
    public void code()
    {
        System.out.println("code : compile : run");
    }
}


public class Interface3 
{
    public static void main(String args[])
    {
        Computers lap = new Laptop();
        Computers desk = new Desktop();

    
        Developer sid = new Developer();
        sid.Devapp(desk); //uses Desktop

        Developer dis = new Developer();
        dis.Devapp(lap);  //uses laptop

    }
} 