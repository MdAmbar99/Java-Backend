
abstract class A{

    public abstract void show();
    public abstract void config();

}


public class AbstractAnonymousClass{
    public static void main(String args[]){
        
        A obj = new A(){
           // creating object of Anonymous Class not class A
            public void show(){
                System.out.println("in New show");
            }
            public void config(){
                System.out.println("in New config");
            }
            
        };
        obj.show();
        obj.config();

    }
}