// abstrct method must be in abstract class always

//abstract class
abstract class Car{

    // abstract method
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }

}

abstract class WagonR extends Car{
    // must define all the abstract method if the class extends a abstract class
    public void drive(){
        System.out.println("Driving ...");
    }
}

// Concrete Class
class UpdatedWagonR extends WagonR{

    public void fly(){
        System.out.println("Flying ...");
    }
}

public class AbstrctKeyword{
    public static void main(String args[]){
        
        // we can not create an object of abstract class ( can create refrence )
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}