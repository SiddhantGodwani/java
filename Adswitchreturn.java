//Advanced switch
//Switch statements
public class Adswitchreturn
    {
        public static void main(String args[])
        {
            String n = "M";
            String r="";
            String Result ;
            Result = switch(n)
            {
                case "M"->"mon";   //  returns value directly

                case "T"-> r="Tue";   // assigns retrn value to r

                case "W"->"wed";   // retrns value directly

                case "TH"-> r="PPP";   // assigns retrn value to r

                case "F"-> "LLL";   // assigns retrn value directly

                // or we can use : yield "value" instead
                // or we can use -> return "value" instead

                default->"Wrong input";
            };
            System.out.println(Result);
            System.out.println(r);
        }
    }