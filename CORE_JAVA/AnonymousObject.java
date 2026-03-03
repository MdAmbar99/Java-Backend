
class A{

    // constructor
    public A(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("in a show");
    }
}


public class AnonymousObject{

    public static void main(){

        // Annonimus object - object without refference or declarations (one time use only coz no declaration)
        new A().show();        
    }
}