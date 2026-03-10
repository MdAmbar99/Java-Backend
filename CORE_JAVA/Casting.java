
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show1(){
        System.out.println("in B show");
    }
}


public class Casting{
    public static void main(String args[]){
        
        double d = 4.5;
        int i = (int)d;

        System.out.println(d);
        System.out.println(i);

        // Up Casting
        A obj = (A) new B();
        obj.show();

        // down casting
        B obj1 = (B) obj;
        obj1.show1();

    }
}

       