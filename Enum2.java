//switch and if else enum cases
//
//using conditional statements to print messages
//accordingly to the Statuses
//switch --> works
//if/else -->works
//

enum Status 
{
    Success,Finished,Running,Error,Failed,Pending
}

public class Enum2{
    public static void main(String args[])
    {
        Status s = Status.Failed;

        if (s == Status.Error){
            System.out.println("404 Not");}

        else if (s == Status.Failed)
        {
            System.out.println("Try Again");
        }
        else if (s == Status.Running){
            System.out.println("All Good");
        }
        else if (s == Status.Failed){
            System.out.println("Try Again");
        }
        else if (s == Status.Failed){
            System.out.println("Try Again");
        }
        else {
            System.out.println("Done");
        }

        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Error:
                System.out.println("404");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            case Failed:
                System.out.println("Try later");
                break;
            default:
                System.out.println("Done");

        }
        
    }
}