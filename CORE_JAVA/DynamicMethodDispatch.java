
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class DynamicMethodDispatch{
    public static void main(String args[]){
        // refrence is of A
        A obj = new A();
        obj.show();

        // here type of obj is A but object in noe of B
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}