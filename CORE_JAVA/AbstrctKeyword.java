// abstrct method must be in abstract class always
abstract class Car{

    public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }

}

class WagonR extends Car{
    // must define all the abstract method if the class extends a abstract class
    public void drive(){
        System.out.println("Driving ...");
    }
}

public class AbstrctKeyword{
    public static void main(String args[]){
        
        // we can not create an object of abstract class ( can create refrence )
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        
    }
}