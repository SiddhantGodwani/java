class Mobile
    {
        String name ;
        int id ;
        // stativ variable belongs to the class and is common for
        // all objects in the class:
        static String country;
       
        public void show()
            {
                System.out.println(name+":"+id+":"+country);
            }
    }

public class Methods
    {
        public static void main(String args[])
        {
        Mobile obj1 = new Mobile();
        obj1.name = "Android";
        obj1.id = 1;
        //object name can be used to call static variable but shouldn't
        obj1.country = "India"; 

        Mobile obj2 = new Mobile();
        obj2.name = "Iphone";
        obj2.id = 2;
        // Correct way to call static variable = using class name
        Mobile.country = "India";
    //<classname>.<variablename> ="declaration" ;

        Mobile obj3 = new Mobile();
        obj3.name = "Blackberry";
        obj3.id = 3;
        // if opened will give country = russia for all class objects:
        //Mobile.country = "Russia";  

        obj1.show();
        obj2.show();
        obj3.show();

        }

    }