// final class stops the inheritance (can't be extended)
// final class Calc{


class Calc{
    // making method final - to stop Method Overriding
    public final void show(){
        System.out.println("By Ambar");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{

    // gives error ( can't override the method )
    // public void show(){
    //     System.out.println("By Aman");
    // }
}

public class finalKeyword{
    public static void main(String args[]){
        // for constant value
        final int num = 8;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(7,9);


        AdvCalc obj1 = new AdvCalc();
        obj1.show();
        obj1.add(3,9);


    }
}