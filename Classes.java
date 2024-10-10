//Class classname{}
class Calculator
    {
        int a;         //<---- variable

        //Object
        public int add(int n1, int n2)   //Method created
        //access_specifier datatype_of_returntype (datetype data too come from object)
        {
            int r = n1+n2;  //what object does= adds 2 values
            return r;
        }
    }
public class Classes
    {
        public static void main(String args[])
            {
                int num1= 11;
                int num2= 22;
                //datatype variable= data of type calculator
                Calculator calc = new Calculator();    //new Object created
                // Class name instance= new-keyword class();
                int result = calc.add(num1,num2); // (values to pass to the class)
               // object-reference.method(passing value)
               // and return the value
                System.out.println(result);
            }
    }