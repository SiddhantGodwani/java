//Inheritance
class Calc  //Super class ,Base class
    {
        public int add(int x,int y)
        {
            return x+y;
        }

        public int sub(int x,int y)
        {
            return x-y;
        }
    }

class AdvCalc extends Calc   //Sub class, Derived class  
//Calls features of Calc main class   
    {
        public int mult(int x,int y)
        {
            return x*y;
        }

        public int div(int x,int y)
        {
            return x/y;
        }
    }
class VeryAdvCalc extends AdvCalc
    {
        public int mod(int x,int y)
        {
            return x%y;
        }

        public int power(int x,int y)
        {
            return  (int)(Math.pow(x, y));   //Typecasting into int as pow returns double value
        }
    }

public class Inheritance
    {
        public static void main(String args[])
            {
                VeryAdvCalc obj = new VeryAdvCalc();
                System.out.println(obj.add(2,3));
                System.out.println(obj.sub(2,3));
                System.out.println(obj.mult(2,3));
                System.out.println(obj.div(2,3));
                System.out.println(obj.mod(2,3));
                System.out.println(obj.power(2,3));

            }
    }