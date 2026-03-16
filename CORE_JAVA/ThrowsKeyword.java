
class A{

    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}



public class ThrowsKeyword{

    static{
        System.out.println(" class loaded ");
    }

    public static void main(String args[]){

        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            // prints to tract from which method the problem arise
            e.printStackTrace();
        }
        
    }
}