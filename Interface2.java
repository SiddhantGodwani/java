//#67 More on interface
//interface2
// An interface can extend muli interface
//***********************************************************************/
//* interface -> interface = extends
//* class -> class = extands
//* class -> interface = implements
//************************************************************************/

interface B
{
    void go();
}
interface C
{
    void set();
}
interface D
{
    void show();
}
interface A extends B,C  // interface can "extend" multiple interfaces at once
{
    void get();
}

class I implements A,D   // Class "implements" multiple interfaces at once
{// has to be implement methods from all the interfaces
    
    @Override
    public void get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
    @Override
    public void set() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }
    
    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }


}
public class Interface2
{
    public static void main(String [] args)
    {// OBJECTS ARE ONLY OF CLASSES AND
    //* INSTANCES CAN BE OF FUNCTIONS TOO
        A obj ;  // only methods in instance A can be called upon
        obj = new I();
        obj.get();
        obj.set();
        obj.go();
    // obj.show(); will throw error as A has "no idea" ehat show method is

        D obj1 = new I();
        obj1.show();  // to run show() we had to create this instance
    }    
}