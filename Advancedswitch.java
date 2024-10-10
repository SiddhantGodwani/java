//Advanced switch
//Switch statements
public class Advancedswitch
    {
        public static void main(String args[])
        {
            String n = "M";

            switch(n)
            {
                case "M"->System.out.println("M");
                
                case "T"->System.out.println("T");

                case "W"->System.out.println("W");
                
                default->System.out.print("Wrong input");
            };
        }
    }