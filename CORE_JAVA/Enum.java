// enumeration { enum }
// used for defining all the names constants

// status is a class here
enum Status{
    // all these are objects
    Running,
    Failed, 
    Pending, 
    Success;
}

public class Enum{
    public static void main(String args[]){

        // Status s = Status.Running;
        Status[] s1 = Status.values();

        // System.out.println(s);

        for(Status s : s1){
            System.out.println(s + " : " + s.ordinal());
        }

        Status s2 = Status.Success;

        if(s2 == Status.Running)
            System.out.println("All Good");
        else if(s2 == Status.Failed)
            System.out.println("Try Again");
        else if(s2 == Status.Pending)
            System.out.println("Plz wait");
        else
            System.out.println("Done");

        
        switch(s2){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Plz wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        // checking super class of the enum class
        System.out.println(s2.getClass().getSuperclass());

    }
}