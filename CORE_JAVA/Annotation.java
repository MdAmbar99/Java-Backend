
@Deprecated             // can use it but better avoid - soon it will be removed from java lang or havinng a better alternative 
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A Show");
    }
}

class B extends A{
    // Override annotation helps check any mistakes
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B Show");
    }
}

public class Annotation{
    public static void main(String args[]){

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}