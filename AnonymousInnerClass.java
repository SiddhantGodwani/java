// AnonymousInnerClass  #63
// i.e Method overriding without declaring another class by no
// normally A obj = new B();  -> but here its without declaring another class 
class A{

    public void show(){
        // System.out.println("A.show()")    idk? what this is 
     
        System.out.println("IN outer class A");

    }
}

public class AnonymousInnerClass
{
    public static void main(String a[]) 
        {
        A obj = new A()
        {// ANONYMOUS INNER CLASS  -->>> CREATES classname$1 class to ----><classname>$n 
           
            public void show()   // overwrites >> the method of class a
            {
                System.out.println("In inner class Anonymous/Unnamed");
            }
        };   

        obj.show();

    }
}