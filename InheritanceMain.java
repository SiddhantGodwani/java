public class InheritanceMain

    {// Inheritance using different java files/class files
    // ie: InheritanceSuperClass & 
    //     InheritanceSubClass

    // using public class InheritanceSubClass extends InheritanceSuperClass---->  //Sub class, Derived class  

        public static void main(String args[])
            {
                InheritanceSubClass obj = new InheritanceSubClass();
                System.out.println(obj.add(2,3));
                System.out.println(obj.sub(2,3));
                System.out.println(obj.mult(2,3));
                System.out.println(obj.div(2,3));

            }
    }