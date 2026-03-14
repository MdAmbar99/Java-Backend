
class A{

    public void show(){
        System.out.println("in A show");
    }
}


public class AnonymousClass{
    public static void main(String args[]){
        
        A obj = new A(){
            // it is new class (without a name) { Inner Class } 
            // Anonymous class
            public void show(){
                System.out.println("in New show");
            }
        };
        obj.show();

    }
}