 //inner classes and static classes

 class A{  // you cannot make outer class static only inner class(es)
    int A;
    public void show(){
        System.out.println("Outer Class");
    }
// static doesnt need object creation
    static class B{   // Static class 
        public void show(){
            System.out.println("Inner Class B");
        }
    }
    class C{  // non static class->(it is a non static method and hence requires object of outer class to be accessed)
        public void show(){
            System.out.println("Inner Class C");
        }
    }
 }

public class InnerClasses{
    public static void main(String args[]){

        A obj = new A();         // [A{B{},C{}}]
        obj.show();

        obj.A = 1;    // accessing variable requires obj and so does(inner classes)
// Accesing inner classes = A.B = OuterClass.InnerClass
//A$B ->> A.B
        A.B obj1 = new A.B();    // object of static inner class of A = A{B{}}
        obj1.show();

        A.C obj2 = obj.new C();  // object of non static inner class of A = A{C{}} using objest of outer class
        obj2.show(); 

    }
}