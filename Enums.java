//# 68 Enum is a class
// enums are fixed constants
// enums = enumerations = return message types . ex-  error code "404 not found"
//ussed to gets status of the server usually  i.e. data not found/ error 404
// used to avoid the use of datatypes such as nums or strings 
//instead of using constanants by urself enum are used

enum Status{
    Running , Error_404 , Failed , Pending , Success   // sequence doesn't matter
}  // Named Constants ---> all have a number (0,1,2,3,.......)

public class Enums
{
    public static void main(String a[])
    {
        int i = 5; // example
        Status s = Status. Running; // Returns Sunning status(obj) of status(class)
        System.out.println(s);
        System.out.println(s.ordinal()); // prints position of running status in Status class 0,1,2....

        Status[] ss = Status.values();  // givs you an Array[of statuses]
        System.out.println(ss); // prints Address of running status
        System.out.println(ss[0]); // print ststus of specified value
        
        // to print all --> using Enhanced for loop
        for(Status all : ss)
        {
            System.out.println(all+":"+ all.ordinal()); // prints all statuses 0 -> end (wth order)
        }


    }
}