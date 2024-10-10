//Advanced switch
//Switch statements
public class Adswitchresult
    {
        public static void main(String args[])
        {
            String n = "M";
            String r="";

            switch(n)
            {
                case "M"-> r="Mon";   // assigns retrn value directly
                case "T"-> r="Tue";   // assigns retrn value directly
                case "W"-> r="NNN";   // assigns retrn value directly
                case "TH"-> r="PPP";   // assigns retrn value directly
                case "F"-> r="LLL";   // assigns retrn value directly
                
                default->System.out.print("Wrong input");
            };
            System.out.println(r);
        }
    }